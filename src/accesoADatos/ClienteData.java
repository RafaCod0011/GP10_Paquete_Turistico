
package accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import entidades.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.JOptionPane;


public class ClienteData {
    
    private Connection con = null;
    
    public ClienteData(){
    con = (Connection) Conexion.getConexion();
}
    
    
    public void guardarCliente(Cliente cliente){
        
        String sql = "INSERT INTO cliente (nombre, apellido, email)" 
                + "VALUES (?, ?, ?)";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); 
            ps.setString(1,cliente.getApellido());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getEmail());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
               if (rs.next()){
                cliente.setClienteId(rs.getInt(1)); 
                JOptionPane.showMessageDialog(null, "Cliente guardado correctamente");
            }
            ps.close();
        
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cliente");
        }
            
        }
    }

