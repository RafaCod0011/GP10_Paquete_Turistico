
package Vistas;

import accesoADatos.TransporteData;
import accesoADatos.TuristaData;
import entidades.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;



public class Main {

    
    public static void main(String[] args) {
        
        TransporteData td= new TransporteData();
        ArrayList<Transporte>listado = new ArrayList();
        
        
        String cadena1 = "11/01/2024";
        String cadena2 = "15/03/2024";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaInicio =  LocalDate.parse(cadena1, formatter);
        LocalDate fechaFin  =  LocalDate.parse(cadena2, formatter);
        
        
        Ciudad origen = new Ciudad(5,"Mendoza", fechaInicio, fechaFin, true);
        Ciudad destino = new Ciudad(6,"Cordoba", fechaInicio, fechaFin, true);
//        
//         Transporte t1 = new Avion(8,origen, destino,"Latam", 2100);
//        Transporte t2 = new Colectivo(origen, destino,"Andesmar", 1000);
//        Transporte t3 = new Colectivo(origen, destino,"Cata", 1100);

//        td.modificarTransporte(t1);
        System.out.println("*** Listado de Transportes Disponibles ***");
        for (Transporte transporte : td.buscarTransporte(origen, destino)) {
            System.out.println(transporte.toString());
        }

            
        

        
        
//        Turista pasajero = new Turista(39396258,"Rafael Cuello", 27);
//        Turista pasajero2 = new Turista(44232258,"Phill Anselmo", 48);
//                     
//        
//        cd.guardarTurista(pasajero);
//        cd.guardarTurista(pasajero2);
//      
//        System.out.println(" *** Se agregaron los siguientes turistas ***");
//        System.out.println(pasajero.toString());  
//        System.out.println(pasajero2.toString());  
//        
//        
//        System.out.println(" *** Modificamos el turista RAFAEL CUELLO***");
//        Turista pasajero3 = new Turista(1,39396258,"Rafael Nicolas Cuello", 28);
//        cd.modificarTurista(pasajero3);
//        System.out.println(pasajero3.toString());  
//        
//        
//       System.out.println(" *** Buscamos un turista por DNI ***");
//        
//        
//       System.out.println("Resultado de la Búsqueda : " + cd.buscarTurista(39396258));
//    
    
//       System.out.println(" *** Eliminamos el turista ***");
//       cd.eliminarTurista(2);
        
    }
    
    
    
}
