
package Vistas;

import accesoADatos.TuristaData;
import entidades.Turista;



public class Main {

    
    public static void main(String[] args) {
        
        TuristaData cd= new TuristaData();
        

        
        
        Turista pasajero = new Turista(39396258,"Rafael Cuello", 27);
        Turista pasajero2 = new Turista(44232258,"Phill Anselmo", 48);
                     
        
        cd.guardarTurista(pasajero);
        cd.guardarTurista(pasajero2);
      
        System.out.println(" *** Se agregaron los siguientes turistas ***");
        System.out.println(pasajero.toString());  
        System.out.println(pasajero2.toString());  
        
        
        System.out.println(" *** Modificamos el turista RAFAEL CUELLO***");
        Turista pasajero3 = new Turista(1,39396258,"Rafael Nicolas Cuello", 28);
        cd.modificarTurista(pasajero3);
        System.out.println(pasajero3.toString());  
        
        
       System.out.println(" *** Buscamos un turista por DNI ***");
        
        
       System.out.println("Resultado de la Búsqueda : " + cd.buscarTurista(39396258));
    
    
//       System.out.println(" *** Eliminamos el turista ***");
//       cd.eliminarTurista(2);
        
    }
    
    
    
}
