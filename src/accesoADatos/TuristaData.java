
package accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import entidades.Turista;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.JOptionPane;


public class TuristaData {
    
    private Connection con = null;
    
    public TuristaData(){
    con = (Connection) Conexion.getConexion();
}
    
    
    public void guardarTurista(Turista turista){
        
        String sql = "INSERT INTO turista (documento, fullName, edad)" 
                + "VALUES (?, ?, ?)";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); 
            ps.setInt(1,turista.getDocumento());
            ps.setString(2, turista.getFullName());
            ps.setInt(3, turista.getEdad());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
               if (rs.next()){
                JOptionPane.showMessageDialog(null, "Turista guardado correctamente");
            }
            ps.close();
        } catch (SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, "El DNI ya existe");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Turistas");
        }
            
        }
    
    
  
    }

