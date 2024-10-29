package entidades;

import java.time.LocalDateTime;

public class Avion extends Transporte {

    public Avion(int idTransporte, Ciudad ciudadOrigen, Ciudad ciudadDestino, String nombreEmpresaTransporte, double precioPersona) {
        super(idTransporte, ciudadOrigen, ciudadDestino, nombreEmpresaTransporte, precioPersona);
        this.tipoTransporte = "Avion";
    }

    public Avion(Ciudad ciudadOrigen, Ciudad ciudadDestino, String nombreEmpresaTransporte, double precioPersona) {
        super(ciudadOrigen, ciudadDestino, nombreEmpresaTransporte, precioPersona);
        this.tipoTransporte = "Avion";
    }

    
    public Avion() {
        super(); 
        this.tipoTransporte = "Avion"; 
    }

    
    
    @Override
    public String toString() {
        return super.toString() + " (Avión)";
    }
    
    @Override
    public double calcularPrecio() {
       return this.precioPersona * 1.05;
    }
    
}
