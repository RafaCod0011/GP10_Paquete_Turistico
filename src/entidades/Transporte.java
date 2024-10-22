package entidades;

import java.time.LocalDateTime;

public class Transporte {

    private int idTransporte;
    private Ciudad ciudadOrigen;
    private Ciudad ciudadDestino;
    private String nombreEmpresaTransporte;
    String tipoTransporte;
    private LocalDateTime fechaHora;
    private int asientos;
    private double precioPersona;

    public Transporte(int idTransporte, Ciudad ciudadOrigen, Ciudad ciudadDestino, String nombreEmpresaTransporte, String tipoTransporte, LocalDateTime fechaHora, int asientos, double precioPersona) {
        this.idTransporte = idTransporte;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.nombreEmpresaTransporte = nombreEmpresaTransporte;
        this.tipoTransporte = tipoTransporte;
        this.fechaHora = fechaHora;
        this.asientos = asientos;
        this.precioPersona = precioPersona;
    }

    public Transporte(int idTransporte, Ciudad ciudadOrigen, Ciudad ciudadDestino, String nombreEmpresaTransporte, LocalDateTime fechaHora, int asientos, double precioPersona) {
        this.idTransporte = idTransporte;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.nombreEmpresaTransporte = nombreEmpresaTransporte;
        this.fechaHora = fechaHora;
        this.asientos = asientos;
        this.precioPersona = precioPersona;
    }    
    public Transporte() {
    }
    
    public int getIdTransporte() {
        return idTransporte;
    }

    public void setIdTransporte(int idTransporte) {
        this.idTransporte = idTransporte;
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

    public String getNombreEmpresaTransporte() {
        return nombreEmpresaTransporte;
    }

    public void setNombreEmpresaTransporte(String nombreEmpresaTransporte) {
        this.nombreEmpresaTransporte = nombreEmpresaTransporte;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asiento) {
        this.asientos = asiento;
    }

    public double getPrecioPersona() {
        return precioPersona;
    }

    public void setPrecioPersona(double precioPersona) {
        this.precioPersona = precioPersona;
    }



    public double calcularPrecio() {
        
        
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
