package accesoADatos;

import entidades.Regimen;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class RegimenData {
    
    private Connection con = null;
    
    public RegimenData(){
    con = (Connection) Conexion.getConexion();
    }
    
    public void agregarRegimenes(Regimen regimen){
        
        String sql = "INSERT INTO regimenes (idRegimen, denominacion, cargoExtra) VALUES (?, ?, ?)";

        try {
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); 
            ps.setInt(1,regimen.getIdRegimen());
            ps.setString(2, regimen.getDenominacion());
            ps.setDouble(3, regimen.getCargoExtra());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
               if (rs.next()){
                    regimen.setIdRegimen(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Regimen registrado correctamente");
                }
            ps.close();
        } catch (SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, "El Regimen ya existe");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Regimenes");
        }
   }
    
    public void editarRegimen(Regimen regimen) {
    try {
        // Comprobar si ya existe otro régimen con la misma denominación
        List<Regimen> regimenesExistentes = listarRegimenes();
        for (Regimen r : regimenesExistentes) {
            if (r.getDenominacion().equalsIgnoreCase(regimen.getDenominacion()) && r.getIdRegimen() != regimen.getIdRegimen()) {
                JOptionPane.showMessageDialog(null, "La denominación ya está en uso por otro régimen. No se puede modificar.");
                return; // Salir del método sin modificar el régimen
            }
        }

        // Si no se encontró ningún conflicto, proceder a actualizar
        String sql = "UPDATE regimenes SET denominacion = ?, cargoExtra = ? WHERE idRegimen = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, regimen.getDenominacion());
        ps.setDouble(2, regimen.getCargoExtra());
        ps.setInt(3, regimen.getIdRegimen());

        int filasAfectadas = ps.executeUpdate();

        if (filasAfectadas == 1) {
            JOptionPane.showMessageDialog(null, "Régimen modificado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el régimen para actualizar");
        }

        ps.close();
    } catch (SQLIntegrityConstraintViolationException ex) {
        JOptionPane.showMessageDialog(null, "La denominación ya existe.");
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Régimen");
    }
}

    public List<Regimen> listarRegimenes () {
        List<Regimen> regimenes = new ArrayList<>();
        String sql = "SELECT * FROM regimenes";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Regimen regimen = new Regimen (rs.getInt("idRegimen"), rs.getString("denominacion"),
                        rs.getInt("cargoExtra"));
                regimenes.add(regimen);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de Base " + e.getMessage());
        }
        return regimenes;
    }
    
    public Regimen buscarRegimenes(int idRegimen) {
        
        Regimen regimen = null;
        String sql= "SELECT idRegimen,denominacion,cargoExtra FROM regimenes WHERE idRegimen=?";
        PreparedStatement ps = null;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idRegimen);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                
                regimen = new Regimen();
                regimen.setIdRegimen(rs.getInt("idRegimen"));
                regimen.setDenominacion(rs.getString("denominacion"));
                regimen.setCargoExtra(rs.getDouble("cargoExtra"));
            }
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Regimen " + ex.getMessage());
        }
        return regimen;
    }
    
    public String eliminarRegimen(int idRegimen) {
        
        String resultado = "";

        try {

            String sql = "{ CALL EliminarRegimen(?) }";
            CallableStatement stmt = con.prepareCall(sql);
            stmt.setInt(1, idRegimen);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                resultado = rs.getString("Resultado");
            }

            rs.close();
            stmt.close();

        } catch (SQLException e) {
            System.out.println("Error al intentar eliminar el Regimen " + e.getMessage());
        }

        return resultado;

    }
}