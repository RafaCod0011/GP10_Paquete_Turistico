package accesoADatos;
import entidades.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

public class TransporteData {
    
    private Connection con = null;
    public TransporteData tdata = new TransporteData();
    
    
    public TransporteData(){
    con = (Connection) Conexion.getConexion();
           
}
    
public void guardarTransporte(Transporte transporte){
     
    String sql = "INSERT INTO transportes (idCiudadOrigen, idCiudadDestino, nombreEmpresaTransporte, TipoTransporte, precioPersona)" 
               + "VALUES (?, ?, ?, ?, ?)";
    
    try {
        
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        ps.setInt(1, transporte.getCiudadOrigen().getIdCiudad()); 
        ps.setInt(2, transporte.getCiudadDestino().getIdCiudad());
        ps.setString(3, transporte.getNombreEmpresaTransporte());
        ps.setString(4, transporte.getTipoTransporte());
        ps.setDouble(5, transporte.getPrecioPersona());

        ps.executeUpdate();
        
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            transporte.setIdTransporte(rs.getInt(1));
            JOptionPane.showMessageDialog(null, "Transporte guardado correctamente");
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Transportes");
        ex.printStackTrace();
    }
    
    
    
}

public void modificarTransporte(Transporte transporte) {

     String sql = "UPDATE transportes SET idCiudadOrigen=?, idCiudadDestino=?, nombreEmpresaTransporte=?, TipoTransporte=?, precioPersona=? " 
               + "WHERE idTransporte=?";
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, transporte.getCiudadOrigen().getIdCiudad());
        ps.setInt(2, transporte.getCiudadDestino().getIdCiudad());
        ps.setString(3, transporte.getNombreEmpresaTransporte());
        ps.setString(4, transporte.getTipoTransporte());
        ps.setDouble(5, transporte.getPrecioPersona());
        ps.setInt(6, transporte.getIdTransporte());

        int exito = ps.executeUpdate();
        
        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Transporte modificado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el transporte a modificar");
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al modificar el transporte");
    }
}
 
public List<Transporte> buscarTransporte(Ciudad ciudadOrigen, Ciudad ciudadDestino) {
    
     List<Transporte> transportes = new ArrayList<>();
     
    String sql = "SELECT * FROM transportes WHERE idCiudadOrigen=? AND idCiudadDestino=?";
    
    try {
        
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, ciudadOrigen.getIdCiudad());
        ps.setInt(2, ciudadDestino.getIdCiudad());
        
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Transporte transporte = new Transporte();
            transporte.setIdTransporte(rs.getInt("idTransporte"));
            transporte.setCiudadOrigen(ciudadOrigen);
            transporte.setCiudadDestino(ciudadDestino);
            transporte.setNombreEmpresaTransporte(rs.getString("nombreEmpresaTransporte"));
            transporte.setTipoTransporte(rs.getString("TipoTransporte"));
            transporte.setPrecioPersona(rs.getDouble("precioPersona"));
            transportes.add(transporte);
        }
        ps.close();
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al buscar transportes");
    }
    return transportes;
}
 
public void eliminarTransporte(int idTransporte) {

    String sql = "DELETE FROM transportes WHERE idTransporte=?";
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idTransporte);

        int exito = ps.executeUpdate();
        
        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Transporte eliminado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el transporte a eliminar");
        }
        ps.close();
        
    } catch (SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, "Error de integridad referencial");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al eliminar el transporte");
        ex.printStackTrace();
    }
}
    

public List<Transporte> listarTransportes() {
   
    List<Transporte> transportes = new ArrayList<>();
    String sql = "SELECT * FROM transportes";
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Transporte transporte = new Transporte();
            transporte.setIdTransporte(rs.getInt("idTransporte"));
            

            //Ciudad ciudadOrigen = buscarCiudadPorId(rs.getInt("idCiudadOrigen")); 
            //Ciudad ciudadDestino = buscarCiudadPorId(rs.getInt("idCiudadDestino"));
            
            //transporte.setCiudadOrigen(ciudadOrigen);
            //transporte.setCiudadDestino(ciudadDestino);
            transporte.setNombreEmpresaTransporte(rs.getString("nombreEmpresaTransporte"));
            transporte.setTipoTransporte(rs.getString("TipoTransporte"));
            transporte.setPrecioPersona(rs.getDouble("precioPersona"));
            
            transportes.add(transporte);
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al listar transportes");
        ex.printStackTrace();
    }
    return transportes;
}

}
