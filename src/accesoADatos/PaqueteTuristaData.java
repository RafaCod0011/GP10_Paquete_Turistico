
package accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import entidades.*;


public class PaqueteTuristaData {
        private Connection con = null;

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

            JOptionPane.showMessageDialog(null, "Todos los turistas han sido guardados en el paquete con éxito.");
        } catch (SQLException e) {
            try {
                con.rollback(); 
                JOptionPane.showMessageDialog(null, "Error al guardar turistas en el paquete.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al intentar revertir la operación: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }    
    }
}
