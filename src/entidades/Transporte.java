package entidades;

import java.time.LocalDateTime;

public class Transporte {

    private int idTransporte;
    private Ciudad ciudadOrigen;
    private Ciudad ciudadDestino;
    private String nombreEmpresaTransporte;
    private int tipoTransporte;
    private LocalDateTime fechaHora;
    private int asiento;
    private double precioPersona;

    public Transporte(int idTransporte, Ciudad ciudadOrigen, Ciudad ciudadDestino, String nombreEmpresaTransporte, int tipoTransporte, LocalDateTime fechaHora, int asiento, double precioPersona) {
        this.idTransporte = idTransporte;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.nombreEmpresaTransporte = nombreEmpresaTransporte;
        this.tipoTransporte = tipoTransporte;
        this.fechaHora = fechaHora;
        this.asiento = asiento;
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

    public int getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(int tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
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
