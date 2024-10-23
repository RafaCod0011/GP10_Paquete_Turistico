package entidades;

import java.time.LocalDateTime;

public class Auto extends Transporte {

    public Auto(int idTransporte, Ciudad ciudadOrigen, Ciudad ciudadDestino, String nombreEmpresaTransporte, double precioPersona) {
        super(idTransporte, ciudadOrigen, ciudadDestino, nombreEmpresaTransporte, precioPersona);
        this.tipoTransporte = "Auto";
    }

    public Auto(Ciudad ciudadOrigen, Ciudad ciudadDestino, String nombreEmpresaTransporte, double precioPersona) {
        super(ciudadOrigen, ciudadDestino, nombreEmpresaTransporte, precioPersona);
        this.tipoTransporte = "Auto";
    }
 
    public Auto() {
        super(); 
        this.tipoTransporte = "Auto"; 
    }
    public double calcularPrecio() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
