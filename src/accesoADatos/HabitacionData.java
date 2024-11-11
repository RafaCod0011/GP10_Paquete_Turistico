
package accesoADatos;

import entidades.Habitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class HabitacionData {
    
    private Connection con = null;
    
    public HabitacionData(){
    con = (Connection) Conexion.getConexion();
}
    
    
    public void agregarHabitacion(Habitacion habitacion) {
    String sql = "INSERT INTO habitaciones (planta, nroHabitacion, cupo, estado, idAlojamiento) VALUES (?, ?, ?, ?, ?)";
    try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
        ps.setInt(1, habitacion.getPlanta());
        ps.setInt(2, habitacion.getNumerac());
        ps.setInt(3, habitacion.getCupo());
        ps.setBoolean(4, habitacion.isEstado());
        ps.setInt(5, habitacion.getIdAlojamiento()); // Usar el idAlojamiento de la propia habitación

        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();

        if (rs.next()) {
            habitacion.setNroHabitacion(rs.getInt(1));
            //JOptionPane.showMessageDialog(null, "¡Habitación creada correctamente!");
        }

        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Habitacion: " + ex.getMessage());
    }
}
    
    public boolean existeHabitacionEnPlanta(int idAlojamiento, int planta, int numeroHabitacion) {
    String sql = "SELECT COUNT(*) FROM habitaciones WHERE idAlojamiento = ? AND planta = ? AND nroHabitacion = ?";
    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setInt(1, idAlojamiento);
        ps.setInt(2, planta);
        ps.setInt(3, numeroHabitacion);

        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return rs.getInt(1) > 0; 
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al verificar habitación en la base de datos: " + ex.getMessage());
    }
    return false; 
}
    
    
    public List<Habitacion> listarHabitacionesPorAlojamiento(int idAlojamiento){
        
        List<Habitacion> listaHabitaciones = new ArrayList<>();
        String sql = "SELECT * FROM habitaciones WHERE idAlojamiento = ?";

        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlojamiento);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                Habitacion habitacion = new Habitacion(
                    resultSet.getInt("idHabitacion"),
                    resultSet.getInt("planta"),
                    resultSet.getInt("numHab"),
                    resultSet.getInt("cupo"),
                    resultSet.getBoolean("estado")
                );

                listaHabitaciones.add(habitacion);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Habitacion");
        }

        return listaHabitaciones;
    }
    
}
