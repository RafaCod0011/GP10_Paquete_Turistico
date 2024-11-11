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
    private PaqueteTuristaData ptData = new PaqueteTuristaData();

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
                JOptionPane.showMessageDialog(null, "¡El paquete se ha guardado correctamente - N° de Identificación: " + paquete.getIdPaquete());
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
    
    
    public int calcularCantidadTuristasxPaquete(int idPaquete) {
        String sql = "SELECT COUNT(*) AS cantidad FROM paquetesturistas WHERE idPaquete = ?";
        int cantidadTuristas = 0;

        try  {
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, idPaquete);
            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()) {
                cantidadTuristas = resultSet.getInt("cantidad");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cantidadTuristas;
    }
    
     public Paquete buscarPaquete(int idPaquete) {
        Paquete paquete = null;
        String sql = "SELECT p.*, co.*, cd.*, t.*, a.*, r.* " +
                     "FROM paquetes p " +
                     "JOIN ciudades co ON p.idCiudadOrigen = co.idCiudad " +
                     "JOIN ciudades cd ON p.idCiudadDestino = cd.idCiudad " +
                     "JOIN transportes t ON p.idTransporte = t.idTransporte " +
                     "JOIN alojamientos a ON p.idAlojamiento = a.idAlojamiento " +
                     "JOIN regimenes r ON p.idRegimen = r.idRegimen " +
                     "WHERE p.idPaquete = ?";

        try {
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, idPaquete);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                paquete = new Paquete();
                paquete.setIdPaquete(rs.getInt("p.idPaquete"));
                paquete.setFechaDesde(rs.getDate("p.fechaDesde").toLocalDate());
                paquete.setFechaHasta(rs.getDate("p.fechaHasta").toLocalDate());
                paquete.setTraslado(rs.getDouble("p.traslado"));
                paquete.setMontoTotal(rs.getDouble("p.montoTotal"));
                paquete.setPaqueteActivo(rs.getBoolean("p.paqueteActivo"));
                Ciudad ciudadOrigen = ciudadData.buscarCiudad(rs.getInt("p.idCiudadOrigen"));
                Ciudad ciudadDestino = ciudadData.buscarCiudad(rs.getInt("p.idCiudadDestino"));
                paquete.setCiudadOrigen(ciudadOrigen);
                paquete.setCiudadDestino(ciudadDestino);   
                Transporte transporte = transporteData.buscarPorId(rs.getInt("t.idTransporte"));
                paquete.setTransporte(transporte);
                Alojamiento alojamiento = alojamientoData.buscarAlojamientoPorId(rs.getInt("a.idAlojamiento"));
                paquete.setAlojamiento(alojamiento);                
                Regimen regimen = regimenData.buscarRegimenes(rs.getInt("r.idRegimen"));
                paquete.setRegimen(regimen);
                ArrayList<Turista>grupo = ptData.buscarTuristasEnPaquete(rs.getInt("p.idPaquete"));
                paquete.setGrupoBase(grupo);
                
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Paquete " + ex.getMessage());
        }

        return paquete;
    }
     
    public void modificarPaquete(Paquete paquete) {
        
        String sql = "UPDATE paquetes SET idCiudadOrigen = ?, idCiudadDestino = ?, fechaDesde = ?, fechaHasta = ?, idTransporte = ?, idAlojamiento = ?, idRegimen = ?, traslado = ?, montoTotal = ?, paqueteActivo = ? WHERE idPaquete = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
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
            ps.setInt(11, paquete.getIdPaquete()); 

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "¡El paquete se ha modificado correctamente!");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un paquete con el ID proporcionado.");
            }

            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al modificar el paquete: " + e.getMessage());
        }
    }

     
    
    private int obtenerIdPaquetePorDniTurista(int dni){
         
        String sql = "SELECT p.idPaquete FROM turistas t " +
                     "JOIN paquetesturistas pt ON t.idTurista = pt.idTurista " +
                     "JOIN paquetes p ON pt.idPaquete = p.idPaquete " +
                     "WHERE t.documento = ?";
        try {
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, dni);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt("idPaquete");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return -1; // Retorna -1 si no se encuentra un paquete
    }
    
    public void modificarPaquete2(Paquete paquete) {
        
    String sql = "UPDATE paquetes SET idCiudadOrigen = ?, idCiudadDestino = ?, fechaDesde = ?, fechaHasta = ?, " +
                 "idTransporte = ?, idAlojamiento = ?, idRegimen = ?, traslado = ?, montoTotal = ?, paqueteActivo = ? " +
                 "WHERE idPaquete = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {


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
            ps.setInt(11, paquete.getIdPaquete());  


            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                // Verificar si hubo cambios en transporte o alojamiento
                boolean cambioTransporte = false;
                boolean cambioAlojamiento = false;

                // Consultar el estado anterior del paquete desde la base de datos
                String consultaAnterior = "SELECT idTransporte, idAlojamiento FROM paquetes WHERE idPaquete = ?";
                try (PreparedStatement psConsultaAnterior = con.prepareStatement(consultaAnterior)) {
                    psConsultaAnterior.setInt(1, paquete.getIdPaquete());
                    ResultSet rs = psConsultaAnterior.executeQuery();
                    if (rs.next()) {
                        int idTransporteAnterior = rs.getInt("idTransporte");
                        int idAlojamientoAnterior = rs.getInt("idAlojamiento");

                        if (idTransporteAnterior != paquete.getTransporte().getIdTransporte()) {
                            cambioTransporte = true;
                        }
                        if (idAlojamientoAnterior != paquete.getAlojamiento().getIdAlojamiento()) {
                            cambioAlojamiento = true;
                        }
                    }
                }

                // Si hubo cambios en transporte o alojamiento, aplicar la penalización
                if (cambioTransporte || cambioAlojamiento) {
                    // Obtener la cantidad de personas asociadas al paquete
                    int cantidadPersonas = calcularCantidadTuristasxPaquete(paquete.getIdPaquete());

                    // Calcular la penalización del 10% por cada persona y agregarla al monto total
                    double penalizacion = paquete.getMontoTotal() * 0.10 * cantidadPersonas;
                    paquete.setMontoTotal(paquete.getMontoTotal() + penalizacion);

                    // Actualizar el monto total con la penalización
                    String sqlPenalizacion = "UPDATE paquetes SET montoTotal = ? WHERE idPaquete = ?";
                    try (PreparedStatement psPenalizacion = con.prepareStatement(sqlPenalizacion)) {
                        psPenalizacion.setDouble(1, paquete.getMontoTotal());
                        psPenalizacion.setInt(2, paquete.getIdPaquete());
                        psPenalizacion.executeUpdate();
                    }
                }
                JOptionPane.showMessageDialog(null, "¡Paquete modificado correctamente con la penalización aplicada!");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el paquete con ID: " + paquete.getIdPaquete());
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al modificar el paquete: " + e.getMessage());
        }
    }
    
    public List<Paquete> listarPaquetesUltimos2Meses() {
        List<Paquete> listaPaquetes = new ArrayList<>();

        String sql = "SELECT p.idPaquete, p.fechaDesde, p.fechaHasta, p.idCiudadDestino,  " +
                "DATEDIFF(p.fechaHasta, p.fechaDesde) AS Dias, p.idTransporte, p.idAlojamiento, " +
                "p.idRegimen, p.montoTotal, COUNT(pt.idPaquetesTuristas) " +                 
                "AS viajeros FROM paquetes p LEFT JOIN paquetesTuristas pt ON pt.idPaquete = p.idPaquete " +
                "WHERE p.fechaDesde BETWEEN DATE_SUB(CURRENT_DATE, INTERVAL 2 MONTH) AND CURRENT_DATE " +
                "GROUP BY p.idPaquete, p.idCiudadDestino, p.fechaDesde, p.fechaHasta,p.idTransporte, p.idAlojamiento, "
                + "p.idRegimen";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(); 

            while (rs.next()) {
                Paquete paquete = new Paquete();


                paquete.setIdPaquete(rs.getInt("idPaquete"));
                paquete.setFechaDesde(rs.getDate("p.fechaDesde").toLocalDate());
                paquete.setFechaHasta(rs.getDate("p.fechaHasta").toLocalDate());
                Ciudad ciudadDestino = ciudadData.buscarCiudad(rs.getInt("p.idCiudadDestino"));
                paquete.setCiudadDestino(ciudadDestino);   
                Transporte transporte = transporteData.buscarPorId(rs.getInt("p.idTransporte"));
                paquete.setTransporte(transporte);
                Alojamiento alojamiento = alojamientoData.buscarAlojamientoPorId(rs.getInt("p.idAlojamiento"));
                paquete.setAlojamiento(alojamiento);                
                Regimen regimen = regimenData.buscarRegimenes(rs.getInt("p.idRegimen"));
                paquete.setRegimen(regimen);


                paquete.setMontoTotal(rs.getDouble("montoTotal"));



                    listaPaquetes.add(paquete);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Paquetes: " + ex.getMessage());
            }

            return listaPaquetes;
        }

}