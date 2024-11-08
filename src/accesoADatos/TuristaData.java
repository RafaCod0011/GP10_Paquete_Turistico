package accesoADatos;

import entidades.Paquete;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import entidades.Turista;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;
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
                    turista.setIdTurista(rs.getInt(1));
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
          
        String sql= "UPDATE turistas SET documento=?, fullName=?, edad=? " + 
                "WHERE idTurista=?";
        
        try{
            
             PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
             ps.setInt(1, turista.getDocumento());
             ps.setString(2, turista.getFullName());
             ps.setInt(3, turista.getEdad());
             ps.setInt(4, turista.getIdTurista());
             
             
            int exito = ps.executeUpdate();
            
            if (exito == 1){
                JOptionPane.showMessageDialog(null,"Turista modificado correctamente");
            }

        }catch (SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, "El DNI ya existe.");
        }catch (SQLException ex) {
            ex.printStackTrace(); 
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Turista");}}
    
    public Turista buscarTurista(int documento){
        
        Turista turista = null;
        String sql= "SELECT documento,fullName,edad, idTurista FROM turistas WHERE documento=?";
        PreparedStatement ps = null;
        
        try{
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, documento);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                
                turista=new Turista();
                turista.setIdTurista(rs.getInt("idTurista"));
                turista.setDocumento(rs.getInt("documento"));
                turista.setFullName(rs.getString("fullName"));
                turista.setEdad(rs.getInt("edad"));
                
                
            }
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Turista " + ex.getMessage());
        
    }
        return turista;
    }
    
        public Turista buscarTuristaPorId(int id){
        
        Turista turista = null;
        String sql= "SELECT documento,fullName,edad, idTurista FROM turistas WHERE idTurista=?";
        PreparedStatement ps = null;
        
        try{
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                
                turista=new Turista();
                turista.setIdTurista(rs.getInt("idTurista"));
                turista.setDocumento(rs.getInt("documento"));
                turista.setFullName(rs.getString("fullName"));
                turista.setEdad(rs.getInt("edad"));
                
                
            }
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Turista " + ex.getMessage());
        
    }
        return turista;
    }
    
//    public Turista buscarTuristaPorEdad(int documento, int edad) {
//    Turista turista = null;
//    String sql = "SELECT documento, fullName, edad FROM turistas WHERE documento=? AND edad=?";
//    PreparedStatement ps = null;
//
//    try {
//        ps = con.prepareStatement(sql);
//        ps.setInt(1, documento);
//        ps.setInt(2, edad);
//        ResultSet rs = ps.executeQuery();
//
//        if (rs.next()) {
//            turista = new Turista();
//            turista.setDocumento(rs.getInt("documento"));
//            turista.setFullName(rs.getString("fullName"));
//            turista.setEdad(rs.getInt("edad"));
//        }
//    } catch (SQLException ex) {
//        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Turista " + ex.getMessage());
//    }
//
//    return turista;
//}
    
    public String eliminarTurista(int id){
        
        String resultado = "";

        try {

            String sql = "{ CALL EliminarTurista(?) }";
            CallableStatement stmt = con.prepareCall(sql);
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                resultado = rs.getString("Resultado");
            }

            rs.close();
            stmt.close();

        } catch (SQLException e) {
            System.out.println("Error al intentar eliminar la ciudad: " + e.getMessage());
        }

        return resultado;

    }
    
    public List<Turista> listarTurista (){
        
        List<Turista> listaTuristas = new ArrayList<>();
        
        try{
        String sql = "SELECT * FROM turistas ORDER BY idTurista ASC, fullName ASC, edad ASC ";
        
        PreparedStatement ps = con.prepareStatement(sql);
               ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                Turista turista = new Turista();
                turista.setIdTurista(rs.getInt("idTurista"));
                turista.setFullName(rs.getString("fullName"));
                turista.setEdad(rs.getInt("edad"));
                
                listaTuristas.add(turista); // Agregar el turista a la lista

            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Paquetes " + ex.getMessage());
        }
        
        return listaTuristas;
    }
    
    public List<Turista> listarTuristaPaquete() {
    List<Turista> listaTuristas = new ArrayList<>();
    
    try {
        String sql = "SELECT t.idTurista, t.fullName, COUNT(pt.idPaquete) AS cantidadPaquetes " +
                     "FROM turistas t " +
                     "LEFT JOIN paquetesturistas pt ON t.idTurista = pt.idTurista " +
                     "GROUP BY t.idTurista " +
                     "ORDER BY t.idTurista ASC";
        
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Turista turista = new Turista();
            
            turista.setIdTurista(rs.getInt("idTurista"));
            turista.setFullName(rs.getString("fullName"));
            turista.setCantidadPaquetes(rs.getInt("cantidadPaquetes")); // setea el conteo de paquetes
            
            listaTuristas.add(turista); // agregar turista a la lista
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Turista: " + ex.getMessage());
    }
    
    return listaTuristas;
}
    
    /*public List<Turista> listarTuristaDesc (){                                            HAY QUE REVISAR ESTE METODO
    
    List<Turista> listaTuristas = new ArrayList<>();
    
    try{
    String sql = "SELECT * FROM turistas ORDER BY idTurista DESC, fullName DESC, edad DESC ";
    
    PreparedStatement ps = con.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();
    
    while (rs.next()) {
    Turista turista = new Turista();
    turista.setIdTurista(rs.getInt("idTurista"));
    turista.setFullName(rs.getString("fullName"));
    turista.setEdad(rs.getInt("edad"));
    
    listaTuristas.add(turista); // Agregar el turista a la lista
    }
    }catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Paquetes " + ex.getMessage());
    }
    
    return listaTuristas;
*/}

