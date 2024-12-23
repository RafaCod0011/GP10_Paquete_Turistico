
package accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import entidades.Alojamiento;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import entidades.Ciudad;
import entidades.Habitacion;
import java.sql.CallableStatement;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class AlojamientoData {
    
    private Connection con = null;
    
    public AlojamientoData(){
    con = (Connection) Conexion.getConexion();
}
    
    public void agregarAlojamiento(Alojamiento alojamiento){
        
        if (alojamientoExiste(alojamiento.getNombre(), alojamiento.getDireccion())) {
            JOptionPane.showMessageDialog(null, "El alojamiento ya existe.");
            return;
        }else{
            
            String sql = "INSERT INTO alojamientos (tipoAlojamiento, nombre, direccion, idciudad, precioNoche, activo, capacidad, camas, banios) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, alojamiento.getTipoAlojamiento());
            ps.setString(2, alojamiento.getNombre());
            ps.setString(3, alojamiento.getDireccion());
            ps.setInt(4, alojamiento.getCiudad().getIdCiudad());
            ps.setDouble(5, alojamiento.getPrecioNoche());
            ps.setBoolean(6, alojamiento.isActivo());
            ps.setInt(7, alojamiento.getCapacidad());
            ps.setInt(8, alojamiento.getCamas());
            ps.setInt(9, alojamiento.getBanios());
            
            
            ps.executeUpdate();
            ResultSet generatedKeys = ps.getGeneratedKeys();
            if (generatedKeys.next()) {
                alojamiento.setIdAlojamiento(generatedKeys.getInt(1)); // Obtener el ID generado
                JOptionPane.showMessageDialog(null, "¡Alojamiento creado correctamente!");
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alojamiento");
        }
        }
        
    }
        
    public void modificarAlojamiento(Alojamiento alojamiento){
        String sql = "UPDATE alojamientos SET tipoAlojamiento = ?, nombre = ?, direccion = ?, idCiudad = ?, precioNoche = ?, activo = ?, capacidad = ?, camas = ?, banios = ? WHERE idAlojamiento = ?";

        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, alojamiento.getTipoAlojamiento());
            ps.setString(2, alojamiento.getNombre());
            ps.setString(3, alojamiento.getDireccion());
            ps.setInt(4, alojamiento.getCiudad().getIdCiudad());
            ps.setDouble(5, alojamiento.getPrecioNoche());
            ps.setBoolean(6, alojamiento.isActivo());
            ps.setInt(7, alojamiento.getCapacidad());
            ps.setInt(8, alojamiento.getCamas());
            ps.setInt(9, alojamiento.getBanios());
            ps.setInt(10, alojamiento.getIdAlojamiento());  

            int exito= ps.executeUpdate();
            if (exito == 1) {
            
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el alojamiento a modificar");
        }
            ps.close();
        }catch (SQLException ex) {
            ex.printStackTrace(); 
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Alojamientos");
        }
    }
        
    public List<Alojamiento> listarTodos(){
           
           List<Alojamiento> listaAlojamientos = new ArrayList<>();
           
           
           try{
               String sql = "SELECT * FROM alojamientos ORDER BY tipoAlojamiento ASC, nombre ASC, direccion ASC, idCiudad ASC, precioNoche ASC";
               PreparedStatement ps = con.prepareStatement(sql);
               ResultSet rs = ps.executeQuery();
               
               
               CiudadData ciudadData = new CiudadData();

                while (rs.next()) {
                Alojamiento alojamiento = new Alojamiento();
                alojamiento.setIdAlojamiento(rs.getInt("idAlojamiento"));
                alojamiento.setTipoAlojamiento(rs.getString("tipoAlojamiento"));
                alojamiento.setNombre(rs.getString("nombre"));
                alojamiento.setDireccion(rs.getString("direccion"));
                
                 int idCiudad = rs.getInt("idCiudad");
                 Ciudad ciudad = ciudadData.buscarCiudad(idCiudad); // Llamada a CiudadData para obtener la ciudad
                 alojamiento.setCiudad(ciudad);
                
                
                
                alojamiento.setPrecioNoche(rs.getDouble("precioNoche"));
                alojamiento.setActivo(rs.getBoolean("activo"));
                alojamiento.setCapacidad(rs.getInt("capacidad"));
                alojamiento.setCamas(rs.getInt("camas"));
                alojamiento.setBanios(rs.getInt("banios"));
                
                

                listaAlojamientos.add(alojamiento);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alojamiento " + ex.getMessage());
        }

        return listaAlojamientos;
    }
    public List<Alojamiento> listarPorCiudad(int idCiudad){
     
        List<Alojamiento> listaAlojamientos = new ArrayList<>();
        
        try{
            
            String sql = "SELECT * FROM alojamientos WHERE idCiudad = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCiudad);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Alojamiento alojamiento = new Alojamiento();
                alojamiento.setIdAlojamiento(rs.getInt("idAlojamiento"));
                alojamiento.setTipoAlojamiento(rs.getString("tipoAlojamiento"));
                alojamiento.setNombre(rs.getString("nombre"));
                alojamiento.setDireccion(rs.getString("direccion"));
                alojamiento.setPrecioNoche(rs.getDouble("precioNoche"));
                alojamiento.setActivo(rs.getBoolean("activo"));
                alojamiento.setCapacidad(rs.getInt("capacidad"));
                alojamiento.setCamas(rs.getInt("camas"));
                alojamiento.setBanios(rs.getInt("banios"));
                

                listaAlojamientos.add(alojamiento);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alojamiento " + ex.getMessage());
        }

        return listaAlojamientos;
    }
    
    public List<Alojamiento> listarPorCiudadActiva(int idCiudad){
     
        List<Alojamiento> listaAlojamientos = new ArrayList<>();
        
        try{
            
            String sql = "SELECT * FROM alojamientos WHERE idCiudad = ? AND activo=1";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCiudad);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Alojamiento alojamiento = new Alojamiento();
                alojamiento.setIdAlojamiento(rs.getInt("idAlojamiento"));
                alojamiento.setTipoAlojamiento(rs.getString("tipoAlojamiento"));
                alojamiento.setNombre(rs.getString("nombre"));
                alojamiento.setDireccion(rs.getString("direccion"));
                alojamiento.setPrecioNoche(rs.getDouble("precioNoche"));
                alojamiento.setActivo(rs.getBoolean("activo"));
                alojamiento.setCapacidad(rs.getInt("capacidad"));
                alojamiento.setCamas(rs.getInt("camas"));
                alojamiento.setBanios(rs.getInt("banios"));
                

                listaAlojamientos.add(alojamiento);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alojamiento " + ex.getMessage());
        }

        return listaAlojamientos;
    }
    
    public String eliminarAlojamiento(int idAlojamiento){
        
        String resultado = "";

        try {

            String sql = "{ CALL EliminarAlojamiento(?) }";
            CallableStatement stmt = con.prepareCall(sql);
            stmt.setInt(1, idAlojamiento);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                resultado = rs.getString("Resultado");
            }

            rs.close();
            stmt.close();

        } catch (SQLException e) {
            System.out.println("Error al intentar eliminar el Alojamiento: " + e.getMessage());
        }

     return resultado;

    }    
        
    public List<Alojamiento> listarPorTipo(String tipoAlojamiento){
        
        List<Alojamiento> listaAlojamientos = new ArrayList<>();

        try {
            String sql = "SELECT a.*, c.* FROM alojamientos a JOIN ciudades c ON a.idCiudad = c.idCiudad WHERE a.tipoAlojamiento = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tipoAlojamiento); 
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Alojamiento alojamiento = new Alojamiento();
                alojamiento.setIdAlojamiento(rs.getInt("idAlojamiento"));
                alojamiento.setTipoAlojamiento(rs.getString("tipoAlojamiento"));
                alojamiento.setNombre(rs.getString("nombre"));
                alojamiento.setDireccion(rs.getString("direccion"));


                Ciudad ciudad = new Ciudad();
                ciudad.setIdCiudad(rs.getInt("idCiudad"));
                ciudad.setNombre(rs.getString("nombre"));
                ciudad.setDestinoActivo(rs.getBoolean("destinoActivo"));

                alojamiento.setCiudad(ciudad);

                alojamiento.setPrecioNoche(rs.getDouble("precioNoche"));
                alojamiento.setActivo(rs.getBoolean("activo"));
                alojamiento.setCapacidad(rs.getInt("capacidad"));
                alojamiento.setCamas(rs.getInt("camas"));
                alojamiento.setBanios(rs.getInt("banios"));


                listaAlojamientos.add(alojamiento);
            }
        }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alojamiento " + ex.getMessage());


        }
        return listaAlojamientos;
    
    }
    
    public Alojamiento buscarAlojamientoPorId(int idAlojamiento){
        
    Alojamiento alojamiento = null;
    String sql = "SELECT a.*, c.* FROM alojamientos a JOIN ciudades c ON a.idciudad = c.idCiudad WHERE a.idAlojamiento = ?";

    try {
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setInt(1, idAlojamiento); // Pasamos el ID del alojamiento
        ResultSet rs = statement.executeQuery();

        if (rs.next()) {
            alojamiento = new Alojamiento();
            alojamiento.setIdAlojamiento(rs.getInt("idAlojamiento"));
            alojamiento.setTipoAlojamiento(rs.getString("tipoAlojamiento"));
            alojamiento.setNombre(rs.getString("nombre"));
            alojamiento.setDireccion(rs.getString("direccion"));

            
            Ciudad ciudad = new Ciudad();
            ciudad.setIdCiudad(rs.getInt("idCiudad"));
            ciudad.setNombre(rs.getString("c.nombre")); // Alias para evitar conflictos de nombre
            ciudad.setDestinoActivo(rs.getBoolean("destinoActivo"));

            alojamiento.setCiudad(ciudad);

            alojamiento.setPrecioNoche(rs.getDouble("precioNoche"));
            alojamiento.setActivo(rs.getBoolean("activo"));
            alojamiento.setCapacidad(rs.getInt("capacidad"));
            alojamiento.setCamas(rs.getInt("camas"));
            alojamiento.setBanios(rs.getInt("banios"));

        }
    }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());

    
}
    return alojamiento;
    } 
    
    public boolean alojamientoExiste(String nombre, String direccion) {
        String sql = "SELECT COUNT(*) FROM alojamientos WHERE nombre = ? AND direccion = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, direccion);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0; 
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alojamientos: " + ex.getMessage());
        }
        return false;
    }
    
    public double precioTotalEstadia(int idAlojamiento, LocalDate fechaDesde, LocalDate fechaHasta) {
        
        if (fechaDesde.isAfter(fechaHasta) || fechaDesde.isEqual(fechaHasta)) {
            JOptionPane.showMessageDialog(null, "La fecha de inicio debe ser anterior a la fecha de fin.");
            return 0;
}
    
        double precioTotal = 0;
        String sql = "SELECT precioNoche FROM alojamientos WHERE idAlojamiento = ? AND activo = true";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlojamiento);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                double precioPorNoche = rs.getDouble("precioNoche");
                long dias = ChronoUnit.DAYS.between(fechaDesde, fechaHasta);
                precioTotal = precioPorNoche * dias;
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el alojamiento activo con el ID especificado.");
            }
    
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alojamientos");
        }
    
        return precioTotal;
    }
    
}
    
    
    
    
    
    
    
    
    
