
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
    
    
    public void agregarHabitacion(Habitacion habitacion, int idAlojamiento){
        String sql = "INSERT INTO habitaciones (nroHabitacion, planta, numerac, cupo, estado, idAlojamiento) VALUES (?, ?, ?, ?, ?, ?)";

        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, habitacion.getNroHabitacion());
            ps.setInt(2, habitacion.getPlanta());
            ps.setInt(3, habitacion.getNumerac());
            ps.setInt(4, habitacion.getCupo());
            ps.setBoolean(5, habitacion.isEstado());
            ps.setInt(6, idAlojamiento);  // Relaciona la habitación con un alojamiento

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "¡Habitacion creada correctamente!");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Habitacion");
        }
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
                    resultSet.getInt("nroHabitacion"),
                    resultSet.getInt("planta"),
                    resultSet.getInt("numerac"),
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
