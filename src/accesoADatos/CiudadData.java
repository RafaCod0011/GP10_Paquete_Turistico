package accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.JOptionPane;
import entidades.Ciudad;
import java.util.ArrayList;
import java.util.List;

public class CiudadData {
    
    private Connection con = null;
    
    public CiudadData(){
        con = Conexion.getConexion();
    }
    
    public void agregarCiudad(Ciudad ciudad){
        
        String sql = "INSERT INTO ciudades (nombre, fechaInicioTemporada, fechaFinTemporada, destinoActivo)" 
                   + "VALUES (?, ?, ?, ?)";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, ciudad.getNombre());
            ps.setDate(2, java.sql.Date.valueOf(ciudad.getFechaInicioTemporada()));
            ps.setDate(3, java.sql.Date.valueOf(ciudad.getFechaFinTemporada()));
            ps.setBoolean(4, ciudad.getDestinoActivo());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                ciudad.setIdCiudad(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "¡Ciudad agregada correctamente!");
                }
            
            ps.close();
       
        }catch (SQLIntegrityConstraintViolationException ex){
            JOptionPane.showMessageDialog(null,"Error: La ciudad ya existe.");
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ciudades.");
        }
    }
    
    public void modificarCiudad(Ciudad ciudad){
        
        String sql = "UPDATE ciudades SET nombre=?, fechaInicioTemporada=?, fechaFinTemporada=?, destinoActivo=?)"
                + "WHERE idCiudad=?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ciudad.getNombre());
            ps.setDate(2, java.sql.Date.valueOf(ciudad.getFechaInicioTemporada()));
            ps.setDate(3, java.sql.Date.valueOf(ciudad.getFechaFinTemporada()));
            ps.setBoolean(4, ciudad.getDestinoActivo());
            ps.setInt(5, ciudad.getIdCiudad());
            
            int exito = ps.executeUpdate();
            
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Ciudad modificada correctamente!!");
            }
            ps.close();
            
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error a modificar la ciudad." + ex.getMessage());
        }
    }
    
    public Ciudad buscarCiudad(int idCiudad){
        
        Ciudad ciudad = null;
        String sql="SELECT * FROM ciudades WHERE idCiudad=? AND destinoActivo=1";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCiudad);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                ciudad = new Ciudad();
                
                ciudad.setIdCiudad(rs.getInt("idCiudad"));
                ciudad.setNombre(rs.getString("nombre"));
                ciudad.setFechaInicioTemporada(rs.getDate("fechaInicioTemporada").toLocalDate());
                ciudad.setFechaFinTemporada(rs.getDate("fechaFinTemporada").toLocalDate());
                ciudad.setDestinoActivo(rs.getBoolean("destinoActivo"));
                
            }
            
            ps.close();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ciudades." + ex.getMessage());
        }
        
        return ciudad;
    }
    
    public void desactivarCiudad(int idCiudad){
        
        String sql = "UPDATE ciudades SET destinoActivo=false WHERE idCiudad=?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCiudad);
            
            int exito = ps.executeUpdate();
            
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "¡Ciudad desactivada correctamente!");
            }
            
            ps.close();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al desactivar la ciudad:" + ex.getMessage());
        }
    }
    
    public void activarCiudad(int idCiudad){
        
        String sql = "UPDATE ciudades SET destinoActivo=true WHERE idCiudad=?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCiudad);
            
            int exito = ps.executeUpdate();
            
            if(exito==1){
                JOptionPane.showMessageDialog(null, "¡Ciudad Activada correctamente!");
            }
            
            ps.close();
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al activar la ciudad: " + ex.getMessage());
        }
    }
    
    public List<Ciudad> listarCiudades() {

        List<Ciudad> ciudades = new ArrayList<>();

        String sql = "SELECT * FROM ciudades ORDER BY nombre";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Ciudad ciudad = new Ciudad();
                ciudad.setIdCiudad(rs.getInt("idCiudad"));
                ciudad.setNombre(rs.getString("nombre"));
                ciudad.setFechaInicioTemporada(rs.getDate("fechaInicioTemporada").toLocalDate());
                ciudad.setFechaFinTemporada(rs.getDate("fechaFinTemporada").toLocalDate());
                ciudad.setDestinoActivo(rs.getBoolean("destinoActivo"));

                ciudades.add(ciudad);
            }

            rs.close();
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar las ciudades: " + ex.getMessage());
        }

        return ciudades;
    }
    
    public List<Ciudad> listarCiudadesExcluyendo(Ciudad ciudadExcluida) {
        
        List<Ciudad> ciudades = new ArrayList<>();

        String sql = "SELECT * FROM ciudades WHERE idCiudad != ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ciudadExcluida.getIdCiudad());  

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Ciudad ciudad = new Ciudad();
                ciudad.setIdCiudad(rs.getInt("idCiudad"));
                ciudad.setNombre(rs.getString("nombre"));
                ciudad.setFechaInicioTemporada(rs.getDate("fechaInicioTemporada").toLocalDate());
                ciudad.setFechaFinTemporada(rs.getDate("fechaFinTemporada").toLocalDate());
                ciudad.setDestinoActivo(rs.getBoolean("destinoActivo"));

                ciudades.add(ciudad);
            }

            rs.close();
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar las ciudades: " + ex.getMessage());
        }

        return ciudades;
    }

}
