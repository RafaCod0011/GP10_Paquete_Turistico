
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
        
        String sql = "INSERT INTO turistas (Documento, fullName, edad)" 
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
    
    public void modificarTurista(Turista turista){
          
        String sql= "UPDATE turistas SET documento=?, fullName=?, edad=?" + "WHERE documento=?";
        
        try{
            
             PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
             ps.setInt(1, turista.getDocumento());
             ps.setString(2, turista.getFullName());
             ps.setInt(3, turista.getEdad());
             
            int exito = ps.executeUpdate();
            
            if (exito == 1){
                JOptionPane.showMessageDialog(null,"Turista modificado correctamente");
            }

        }catch (SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, "El DNI ya existe.");
        }catch (SQLException ex) {
            ex.printStackTrace(); 
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Alumno");}}
    
    public Turista buscarTurista(int documento){
        
        Turista turista = null;
        String sql= "SELECT documento,fullName,edad FROM turistas WHERE documento=?";
        PreparedStatement ps = null;
        
        try{
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, documento);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                
                turista=new Turista();
                turista.setDocumento(rs.getInt("documento"));
                turista.setFullName(rs.getString("fullName"));
                turista.setEdad(rs.getInt("edad"));
                
            }
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Turista " + ex.getMessage());
        
    }
        return turista;
    }
    
    public void eliminarTurista(int id){

        String sql = "DELETE FROM turistas WHERE documento = ? ";
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Se ha eliminado el turista con documento N°" + id);
            ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        
        
        
    }
}
  