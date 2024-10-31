package accesoADatos;

import entidades.Regimen;
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
    
    public void eliminarRegimenes (int idRegimen) {
         String sql = "DELETE FROM regimenes WHERE idRegimen=?";

        try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idRegimen);

        int exito = ps.executeUpdate();

        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "¡Regimen eliminado correctamente!");
        }else {
            JOptionPane.showMessageDialog(null, "No se encontró la el Regimen con el ID especificado.");
        }

        ps.close();

      }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al eliminar el Regimen: " + ex.getMessage());
       }
    }
}