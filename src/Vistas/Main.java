
package Vistas;

import accesoADatos.TuristaData;
import entidades.Turista;



public class Main {

    
    public static void main(String[] args) {
        
        Turista pasajero = new Turista(39396258,"Rafael Cuello", 27);
        
        TuristaData cd= new TuristaData();
        
        cd.guardarTurista(pasajero);
      
        System.out.println(pasajero.toString());  
        
    }
    
    
    
}
