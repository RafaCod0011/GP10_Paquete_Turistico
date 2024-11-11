
package accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import entidades.*;


public class PaqueteTuristaData {
    
    private Connection con = null;
    TuristaData tData = new TuristaData();    

    public PaqueteTuristaData() {
        con = Conexion.getConexion();
    }

    public void guardarTuristasEnPaquete(int idPaquete, ArrayList<Turista> turistas) {
        String sql = "INSERT INTO paquetesTuristas (idPaquete, idTurista) VALUES (?, ?)";
        
        try {
            con.setAutoCommit(false); 
            
            PreparedStatement ps = con.prepareStatement(sql);

            for (Turista turista : turistas) {
                ps.setInt(1, idPaquete);
                ps.setInt(2, turista.getIdTurista());
                ps.addBatch(); 
            }

            ps.executeBatch(); 
            con.commit(); 
                        
        } catch (SQLException e) {
            try {
                con.rollback(); 
                JOptionPane.showMessageDialog(null, "Error al guardar turistas en el paquete.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al intentar revertir la operación: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }    
    }
    
    public ArrayList<Turista> buscarTuristasEnPaquete(int id) {
        
        
        ArrayList<Turista> turistas = new ArrayList<>();
        String sql = "SELECT idTurista FROM paquetesturistas WHERE idPaquete = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Turista turista = new Turista();
                //turista.setIdTurista(rs.getInt("idTurista"));
                turista = tData.buscarTuristaPorId(rs.getInt("idTurista"));
                turistas.add(turista);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar turistas en el paquete: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return turistas;
        
    }
    public void eliminarTuristasEnPaquete(int idPaquete) {
        String sql = "DELETE FROM paquetesTuristas WHERE idPaquete = ?";

        try {
            con.setAutoCommit(false); 

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPaquete);

            ps.executeUpdate();
            con.commit(); 

       } catch (SQLException e) {
            try {
                con.rollback(); //En caso de encontrarse algun error, se vuelve atras la operación
                JOptionPane.showMessageDialog(null, "Error al eliminar turistas del paquete.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al intentar revertir la operación: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    
    
}
