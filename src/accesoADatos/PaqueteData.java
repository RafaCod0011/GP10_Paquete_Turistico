package accesoADatos;

import entidades.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PaqueteData {
    
    private Connection con = null;
    private CiudadData ciudadData = new CiudadData();
    private TransporteData transporteData = new TransporteData();
    private AlojamientoData alojamientoData = new AlojamientoData();
    private RegimenData regimenData = new RegimenData();

    public PaqueteData() {
        con = (Connection) Conexion.getConexion();
    }

    public void agregarPaquete(Paquete paquete) {
        String sql = "INSERT INTO paquetes (ciudadOrigen, ciudadDestino, fechaDesde, fechaHasta, transporte, alojamiento, regimen, traslado, precioPersona, montoTotal, paqueteActivo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, paquete.getCiudadOrigen().getIdCiudad()); 
            ps.setInt(2, paquete.getCiudadDestino().getIdCiudad());
            ps.setDate(3, Date.valueOf(paquete.getFechaDesde())); 
            ps.setDate(4, Date.valueOf(paquete.getFechaHasta()));
            ps.setInt(5, paquete.getTransporte().getIdTransporte()); 
            ps.setInt(6, paquete.getAlojamiento().getIdAlojamiento()); 
            ps.setInt(7, paquete.getRegimen().getIdRegimen()); 
            ps.setFloat(8, paquete.getTraslado());
            ps.setDouble(9, paquete.getPrecioPersona());
            ps.setDouble(10, paquete.getMontoTotal());
            ps.setBoolean(11, paquete.isPaqueteActivo());

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    paquete.setIdPaquete(rs.getInt(1)); 
                }
                JOptionPane.showMessageDialog(null, "¡Paquete agregado correctamente!");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar el paquete: " + ex.getMessage());
        }
    }

    public String eliminarPaquete(int idPaquete) {
        String resultado = "";

        try {
            String sql = "{ CALL EliminarPaquete(?) }"; 
            CallableStatement stmt = con.prepareCall(sql);
            stmt.setInt(1, idPaquete);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                resultado = rs.getString("Resultado");
            }

            rs.close();
            stmt.close();

        } catch (SQLException e) {
            System.out.println("Error al intentar eliminar el paquete: " + e.getMessage());
        }

        return resultado;
    }
}