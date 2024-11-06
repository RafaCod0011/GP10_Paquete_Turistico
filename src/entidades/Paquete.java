package entidades;

import java.time.LocalDate;
import java.util.ArrayList;

public class Paquete {

    private int idPaquete;
    private Ciudad ciudadOrigen;
    private Ciudad ciudadDestino;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private Transporte transporte;
    private Alojamiento alojamiento;
    private Regimen regimen;
    private double traslado;
    private ArrayList<Turista> grupoBase;
    private double montoTotal;
    private boolean paqueteActivo;

    public Paquete(int idPaquete, Ciudad ciudadOrigen, Ciudad ciudadDestino, LocalDate fechaDesde, LocalDate fechaHasta, Transporte transporte, Alojamiento alojamiento, Regimen regimen, double traslado, ArrayList<Turista> grupoBase, double montoTotal, boolean paqueteActivo) {
        this.idPaquete = idPaquete;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.transporte = transporte;
        this.alojamiento = alojamiento;
        this.regimen = regimen;
        this.traslado = traslado;
        this.grupoBase = grupoBase;
        this.montoTotal = montoTotal;
        this.paqueteActivo = paqueteActivo;
    }

    public Paquete(Ciudad ciudadOrigen, Ciudad ciudadDestino, LocalDate fechaDesde, LocalDate fechaHasta, Transporte transporte, Alojamiento alojamiento, Regimen regimen, double traslado, double montoTotal, boolean paqueteActivo) {
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.transporte = transporte;
        this.alojamiento = alojamiento;
        this.regimen = regimen;
        this.traslado = traslado;
        this.montoTotal = montoTotal;
        this.paqueteActivo = paqueteActivo;
    }
    
    

    public Paquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }
    
    
      
    public Paquete() {
    }

    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public Ciudad getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(Ciudad ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public Ciudad getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(Ciudad ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public LocalDate getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(LocalDate fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public LocalDate getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(LocalDate fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public Alojamiento getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(Alojamiento alojamiento) {
        this.alojamiento = alojamiento;
    }

    public Regimen getRegimen() {
        return regimen;
    }

    public void setRegimen(Regimen regimen) {
        this.regimen = regimen;
    }

    public double getTraslado() {
        return traslado;
    }

    public void setTraslado(double traslado) {
        this.traslado = traslado;
    }

    public ArrayList<Turista> getGrupoBase() {
        return grupoBase;
    }

    public void setGrupoBase(ArrayList<Turista> grupoBase) {
        this.grupoBase = grupoBase;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public boolean isPaqueteActivo() {
        return paqueteActivo;
    }

    public void setPaqueteActivo(boolean paqueteActivo) {
        this.paqueteActivo = paqueteActivo;
    }
    
    


}
