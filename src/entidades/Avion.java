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
      
    public double calcularPrecio() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
