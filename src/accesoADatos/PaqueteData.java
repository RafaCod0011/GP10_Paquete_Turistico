package accesoADatos;

import entidades.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
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
        
        String sql = "INSERT INTO paquetes (idCiudadOrigen, idCiudadDestino, fechaDesde, fechaHasta, idTransporte, idAlojamiento, idRegimen, traslado, montoTotal, paqueteActivo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, paquete.getCiudadOrigen().getIdCiudad()); 
            ps.setInt(2, paquete.getCiudadDestino().getIdCiudad());
            ps.setDate(3, Date.valueOf(paquete.getFechaDesde())); 
            ps.setDate(4, Date.valueOf(paquete.getFechaHasta()));
            ps.setInt(5, paquete.getTransporte().getIdTransporte()); 
            ps.setInt(6, paquete.getAlojamiento().getIdAlojamiento()); 
            ps.setInt(7, paquete.getRegimen().getIdRegimen()); 
            ps.setDouble(8, paquete.getTraslado()); 
            ps.setDouble(9, paquete.getMontoTotal()); 
            ps.setBoolean(10, paquete.isPaqueteActivo());

            // Ejecutar la consulta
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    paquete.setIdPaquete(rs.getInt(1)); 
                }
                JOptionPane.showMessageDialog(null, "¡Paquete agregado correctamente!");
            }

            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al agregar el paquete: " + e.getMessage());
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
    
    public List<Paquete> listarPaquetes () {
        
        List<Paquete> listaPaquetes = new ArrayList<>();
        
        try{
        String sql = "SELECT * FROM paquetes ORDER BY idPaquete ASC";
        
        PreparedStatement ps = con.prepareStatement(sql);
               ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                Paquete paquetes = new Paquete();
                paquetes.setIdPaquete(rs.getInt("idPaquete"));
                
                listaPaquetes.add(paquetes); // Agregar el paquete a la lista

            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Paquetes " + ex.getMessage());
        }
        
        return listaPaquetes;
    }
    
    public List<Paquete> listarPaquetesDESC () {
        
        List<Paquete> listaPaquetes = new ArrayList<>();
        
        try{
        String sql = "SELECT * FROM paquetes ORDER BY idPaquete DESC";
        
        PreparedStatement ps = con.prepareStatement(sql);
               ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                Paquete paquetes = new Paquete();
                paquetes.setIdPaquete(rs.getInt("idPaquete"));
                
                listaPaquetes.add(paquetes); // Agregar el paquete a la lista

            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Paquetes " + ex.getMessage());
        }
        
        return listaPaquetes;
    }
}