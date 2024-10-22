package entidades;

import java.time.LocalDateTime;

public class Avion extends Transporte {

    public Avion(int idTransporte, Ciudad ciudadOrigen, Ciudad ciudadDestino, String nombreEmpresaTransporte, LocalDateTime fechaHora, int asientos, double precioPersona) {
        super(idTransporte, ciudadOrigen, ciudadDestino, nombreEmpresaTransporte, fechaHora, asientos, precioPersona);
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
