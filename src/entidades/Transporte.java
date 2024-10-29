package entidades;

import java.time.LocalDateTime;
import java.util.Objects;

public class Transporte {

    private int idTransporte;
    private Ciudad ciudadOrigen;
    private Ciudad ciudadDestino;
    private String nombreEmpresaTransporte;
    String tipoTransporte;
    public double precioPersona;

    public Transporte(int idTransporte, Ciudad ciudadOrigen, Ciudad ciudadDestino, String nombreEmpresaTransporte, String tipoTransporte, double precioPersona) {
        this.idTransporte = idTransporte;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.nombreEmpresaTransporte = nombreEmpresaTransporte;
        this.tipoTransporte = tipoTransporte;
        this.precioPersona = precioPersona;
    }

    public Transporte(int idTransporte, Ciudad ciudadOrigen, Ciudad ciudadDestino, String nombreEmpresaTransporte, double precioPersona) {
        this.idTransporte = idTransporte;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.nombreEmpresaTransporte = nombreEmpresaTransporte;
        this.precioPersona = precioPersona;
    }    

    public Transporte(Ciudad ciudadOrigen, Ciudad ciudadDestino, String nombreEmpresaTransporte, double precioPersona) {
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.nombreEmpresaTransporte = nombreEmpresaTransporte;
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

    public double getPrecioPersona() {
        return precioPersona;
    }

    public void setPrecioPersona(double precioPersona) {
        this.precioPersona = precioPersona;
    }

    @Override
    public String toString() {
        return ciudadOrigen.getNombre() + " / " + ciudadDestino.getNombre() + "  |  "+ tipoTransporte +" - "+ nombreEmpresaTransporte +  " $" + precioPersona;
        //return idTransporte + " - " + ciudadOrigen.getNombre() + " / " + ciudadDestino.getNombre() + " | "+ tipoTransporte +"-"+ nombreEmpresaTransporte +  " $" + precioPersona;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.tipoTransporte);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Transporte other = (Transporte) obj;
        return Objects.equals(this.tipoTransporte, other.tipoTransporte);
    }

    
    public double calcularPrecio() {
       return this.precioPersona;
    }


}
