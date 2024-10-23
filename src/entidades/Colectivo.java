package entidades;


import entidades.Transporte;
import java.time.LocalDateTime;

public class Colectivo extends Transporte {

    public Colectivo(int idTransporte, Ciudad ciudadOrigen, Ciudad ciudadDestino, String nombreEmpresaTransporte, double precioPersona) {
        super(idTransporte, ciudadOrigen, ciudadDestino, nombreEmpresaTransporte, precioPersona);
        this.tipoTransporte = "Colectivo";
    }

    public Colectivo(Ciudad ciudadOrigen, Ciudad ciudadDestino, String nombreEmpresaTransporte, double precioPersona) {
        super(ciudadOrigen, ciudadDestino, nombreEmpresaTransporte, precioPersona);
        this.tipoTransporte = "Colectivo";
    }

    
    
    public Colectivo() {
        super(); 
        this.tipoTransporte = "Colectivo"; 
    }
    public double calcularPrecio() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
