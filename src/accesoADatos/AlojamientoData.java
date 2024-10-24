
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


public class AlojamientoData {
    
    private Connection con = null;
    
    public AlojamientoData(){
    con = (Connection) Conexion.getConexion();
}
    
    public void agregarAlojamiento(Alojamiento alojamiento){
        
        String sql = "INSERT INTO alojamientos (idTipoAlojamiento, nombre, direccion, idciudad, precioNoche, activo, capacidad, camas, banios) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, alojamiento.getIdTipoAlojamiento());
            ps.setString(2, alojamiento.getNombre());
            ps.setString(3, alojamiento.getDireccion());
            ps.setInt(4, alojamiento.getCiudad().getIdCiudad());
            ps.setDouble(5, alojamiento.getPrecioNoche());
            ps.setBoolean(6, alojamiento.isActivo());
            ps.setInt(7, alojamiento.getCapacidad());
            ps.setInt(8, alojamiento.getCamas());
            ps.setInt(9, alojamiento.getBanios());
            
            
//            ps.setString(10, alojamiento.getHabitaciones().toString()); 
            
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
        
    public void modificarAlojamiento(Alojamiento alojamiento){
        String sql = "UPDATE alojamiento SET idTipoAlojamiento = ?, nombre = ?, direccion = ?, ciudad = ?, precioNoche = ?, activo = ?, capacidad = ?, camas = ?, banios = ?, habitaciones = ? WHERE idAlojamiento = ?";

        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, alojamiento.getIdTipoAlojamiento());
            ps.setString(2, alojamiento.getNombre());
            ps.setString(3, alojamiento.getDireccion());
            ps.setInt(4, alojamiento.getCiudad().getIdCiudad());
            ps.setDouble(5, alojamiento.getPrecioNoche());
            ps.setBoolean(6, alojamiento.isActivo());
            ps.setInt(7, alojamiento.getCapacidad());
            ps.setInt(8, alojamiento.getCamas());
            ps.setInt(9, alojamiento.getBanios());
//            ps.setString(10, alojamiento.getHabitaciones().toString());
            ps.setInt(11, alojamiento.getIdAlojamiento());

            ps.executeUpdate();
        }catch (SQLException ex) {
            ex.printStackTrace(); 
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Alumno");
        }
    }
        
    public List<Alojamiento> listarTodos(){
           
           List<Alojamiento> listaAlojamientos = new ArrayList<>();
           
           
           try{
               String sql = "SELECT * FROM alojamiento";
               PreparedStatement ps = con.prepareStatement(sql);
               ResultSet rs = ps.executeQuery();
               
               
//               CiudadData ciudadData = new CiudadData(connection);

                while (rs.next()) {
                Alojamiento alojamiento = new Alojamiento();
                alojamiento.setIdAlojamiento(rs.getInt("idAlojamiento"));
                alojamiento.setIdTipoAlojamiento(rs.getString("idTipoAlojamiento"));
                alojamiento.setNombre(rs.getString("nombre"));
                alojamiento.setDireccion(rs.getString("direccion"));
                
//                 int idCiudad = resultSet.getInt("ciudad");
//                 Ciudad ciudad = ciudadData.obtenerCiudadPorId(idCiudad); // Llamada a CiudadData para obtener la ciudad
//                 alojamiento.setCiudad(ciudad);
                
                
                
                alojamiento.setPrecioNoche(rs.getDouble("precioNoche"));
                alojamiento.setActivo(rs.getBoolean("activo"));
                alojamiento.setCapacidad(rs.getInt("capacidad"));
                alojamiento.setCamas(rs.getInt("camas"));
                alojamiento.setBanios(rs.getInt("banios"));
                
                // Falta habitacion.

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
            
            String sql = "SELECT * FROM alojamiento WHERE ciudad = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCiudad);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Alojamiento alojamiento = new Alojamiento();
                alojamiento.setIdAlojamiento(rs.getInt("idAlojamiento"));
                alojamiento.setIdTipoAlojamiento(rs.getString("idTipoAlojamiento"));
                alojamiento.setNombre(rs.getString("nombre"));
                alojamiento.setDireccion(rs.getString("direccion"));
                alojamiento.setPrecioNoche(rs.getDouble("precioNoche"));
                alojamiento.setActivo(rs.getBoolean("activo"));
                alojamiento.setCapacidad(rs.getInt("capacidad"));
                alojamiento.setCamas(rs.getInt("camas"));
                alojamiento.setBanios(rs.getInt("banios"));
                // Falta habitaciones.

                listaAlojamientos.add(alojamiento);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alojamiento " + ex.getMessage());
        }

        return listaAlojamientos;
    }
    
    public void eliminarAlojamiento(int idAlojamiento){
        String sql = "DELETE FROM alojamiento WHERE idAlojamiento = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlojamiento);
            ps.executeUpdate();
        }catch (SQLException e) {
         JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
    }

    }    
        
    public List<Alojamiento> listarPorTipo(int idTipoAlojamiento){
        
    List<Alojamiento> listaAlojamientos = new ArrayList<>();
   
    try {
        String sql = "SELECT a.*, c.* FROM alojamiento a JOIN ciudad c ON a.ciudad = c.idCiudad WHERE a.idTipoAlojamiento = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idTipoAlojamiento); // Filtrar por el tipo de alojamiento
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Alojamiento alojamiento = new Alojamiento();
            alojamiento.setIdAlojamiento(rs.getInt("idAlojamiento"));
            alojamiento.setIdTipoAlojamiento(rs.getString("idTipoAlojamiento"));
            alojamiento.setNombre(rs.getString("nombre"));
            alojamiento.setDireccion(rs.getString("direccion"));

           
//            Ciudad ciudad = new Ciudad();
//            ciudad.setIdCiudad(resultSet.getInt("idCiudad"));
//            ciudad.setNombre(resultSet.getString("nombre"));
//            ciudad.setFechaInicioTemporada(resultSet.getDate("fechaInicioTemporada").toLocalDate());
//            ciudad.setFechaFinTemporada(resultSet.getDate("fechaFinTemporada").toLocalDate());
//            ciudad.setDestinoActivo(resultSet.getBoolean("destinoActivo"));

//            alojamiento.setCiudad(ciudad);

            alojamiento.setPrecioNoche(rs.getDouble("precioNoche"));
            alojamiento.setActivo(rs.getBoolean("activo"));
            alojamiento.setCapacidad(rs.getInt("capacidad"));
            alojamiento.setCamas(rs.getInt("camas"));
            alojamiento.setBanios(rs.getInt("banios"));
            //Falta habitaciones

            listaAlojamientos.add(alojamiento);
        }
    }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());

    
}
    return listaAlojamientos;}
    
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
            alojamiento.setIdTipoAlojamiento(rs.getString("idTipoAlojamiento"));
            alojamiento.setNombre(rs.getString("nombre"));
            alojamiento.setDireccion(rs.getString("direccion"));

            // Crear el objeto Ciudad
            Ciudad ciudad = new Ciudad();
            ciudad.setIdCiudad(rs.getInt("idCiudad"));
            ciudad.setNombre(rs.getString("c.nombre")); // Alias para evitar conflictos de nombre
            ciudad.setFechaInicioTemporada(rs.getDate("fechaInicioTemporada").toLocalDate());
            ciudad.setFechaFinTemporada(rs.getDate("fechaFinTemporada").toLocalDate());
            ciudad.setDestinoActivo(rs.getBoolean("destinoActivo"));

            alojamiento.setCiudad(ciudad);

            alojamiento.setPrecioNoche(rs.getDouble("precioNoche"));
            alojamiento.setActivo(rs.getBoolean("activo"));
            alojamiento.setCapacidad(rs.getInt("capacidad"));
            alojamiento.setCamas(rs.getInt("camas"));
            alojamiento.setBanios(rs.getInt("banios"));

            // Si tienes habitaciones asociadas, puedes cargarlas aquí:
            HabitacionData habitacionData = new HabitacionData();
            List<Habitacion> habitaciones = habitacionData.listarHabitacionesPorAlojamiento(idAlojamiento);
            
            alojamiento.setHabitaciones(habitaciones); // Asumiendo que el alojamiento tiene un setHabitaciones()
        }
    }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());

    
}
    return alojamiento;
    } 
    
}
    


    
    
    
    
    
    
