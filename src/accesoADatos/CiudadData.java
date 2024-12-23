package accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;  
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
    
    public void agregarCiudad(Ciudad ciudad) {
        String sql = "INSERT INTO ciudades (nombre, destinoActivo) VALUES (?, ?)";

    try {
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, ciudad.getNombre());
        ps.setBoolean(2, ciudad.getDestinoActivo());

        int rowsAffected = ps.executeUpdate();

        if (rowsAffected > 0) {
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                ciudad.setIdCiudad(rs.getInt(1)); // Asignar el ID generado a la ciudad
            }
            JOptionPane.showMessageDialog(null, "¡Ciudad agregada correctamente!");
        }

        ps.close();

        } catch (SQLIntegrityConstraintViolationException ex) {
        JOptionPane.showMessageDialog(null, "Error: La ciudad ya existe.");
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al agregar la ciudad: " + ex.getMessage());
        }
    }

    public String eliminarCiudad(int idCiudad) {
        
        String resultado = "";

        try {

            String sql = "{ CALL EliminarCiudad(?) }";
            CallableStatement stmt = con.prepareCall(sql);
            stmt.setInt(1, idCiudad);

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

    public void modificarCiudad(Ciudad ciudad) {
    String sql = "UPDATE ciudades SET nombre=?, destinoActivo=? WHERE idCiudad=?";

        try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, ciudad.getNombre());
        ps.setBoolean(2, ciudad.getDestinoActivo());
        ps.setInt(3, ciudad.getIdCiudad());

        int exito = ps.executeUpdate();

        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Ciudad modificada correctamente.");
        }
          ps.close();

        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error al modificar la ciudad: " + ex.getMessage());
        }
    }

    public Ciudad buscarCiudad(int idCiudad) {
      Ciudad ciudad = null;
      String sql = "SELECT * FROM ciudades WHERE idCiudad=?";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idCiudad);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            ciudad = new Ciudad();
            ciudad.setIdCiudad(rs.getInt("idCiudad"));
            ciudad.setNombre(rs.getString("nombre"));
            ciudad.setDestinoActivo(rs.getBoolean("destinoActivo"));
        }

          rs.close();
          ps.close();

        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ciudades: " + ex.getMessage());
        }

      return ciudad;
    }

    public void desactivarCiudad(int idCiudad) {
    String sql = "UPDATE ciudades SET destinoActivo=false WHERE idCiudad=?";

      try {
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setInt(1, idCiudad);

          int exito = ps.executeUpdate();

        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "¡Ciudad desactivada correctamente!");
        }

          ps.close();

        } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "Error al desactivar la ciudad: " + ex.getMessage());
        }
    }

    public void activarCiudad(int idCiudad) {
      String sql = "UPDATE ciudades SET destinoActivo=true WHERE idCiudad=?";

       try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idCiudad);

        int exito = ps.executeUpdate();

        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "¡Ciudad activada correctamente!");
        }

          ps.close();

       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error al activar la ciudad: " + ex.getMessage());
      }
    }
    public List<Ciudad> listarCiudadesActivas() {
       List<Ciudad> ciudades = new ArrayList<>();
      String sql = "SELECT * FROM ciudades WHERE destinoActivo = 1 ORDER BY nombre";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Ciudad ciudad = new Ciudad();
            ciudad.setIdCiudad(rs.getInt("idCiudad"));
            ciudad.setNombre(rs.getString("nombre"));
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
            ciudad.setDestinoActivo(rs.getBoolean("destinoActivo"));
            ciudades.add(ciudad);
        }

          rs.close();
          ps.close();

        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error al listar las ciudades excluyendo la especificada: " + ex.getMessage());
        }

    return ciudades;
    }
    
    public List<Ciudad> listarCiudadesMasElegidas() {
       List<Ciudad> ciudades = new ArrayList<>();
            String sql = "SELECT c.idCiudad AS idCiudadDestino, c.nombre AS nombreCiudadDestino, " +
                 "COUNT(DISTINCT pt.idTurista) AS totalTuristas, " +
                 "COUNT(DISTINCT p.idPaquete) AS totalPaquetes " +
                 "FROM ciudades c " +
                 "JOIN paquetes p ON c.idCiudad = p.idCiudadDestino " +
                 "LEFT JOIN paquetesturistas pt ON p.idPaquete = pt.idPaquete " +
                 "GROUP BY c.idCiudad, c.nombre " +
                 "ORDER BY c.nombre ASC";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Ciudad ciudad = new Ciudad();
            ciudad.setIdCiudad(rs.getInt("idCiudadDestino"));
            ciudad.setNombre(rs.getString("nombreCiudadDestino"));
            ciudad.setTotalTuristas(rs.getInt("totalTuristas"));
            ciudad.setTotalPaquetes(rs.getInt("totalPaquetes"));
            ciudades.add(ciudad);
        }

        rs.close();
        ps.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al listar las ciudades con estadísticas: " + ex.getMessage());
    }
    return ciudades;
    }
    
}

