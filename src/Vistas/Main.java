
package Vistas;

import accesoADatos.TuristaData;
import entidades.Turista;



public class Main {

    
    public static void main(String[] args) {
        
        
//        Turista pasajero = new Turista(39396258,"Rafael Cuello", 27);
//        Turista pasajero2 = new Turista(44232258,"Phill Anselmo", 48);
        
        TuristaData cd= new TuristaData();
//        
//        
//        cd.guardarTurista(pasajero);
//        cd.guardarTurista(pasajero2);
//      
//        System.out.println(pasajero.toString());  
//        
//        Turista nuevoTurista = null;
//        
//        nuevoTurista = cd.buscarTurista(39396258);
//        
//        System.out.println("Resultado de la Búsqueda : " + nuevoTurista.getFullName());
        
        cd.eliminarTurista(4);
        
    }
    
    
    
}
