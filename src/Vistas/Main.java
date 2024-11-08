
package Vistas;

import accesoADatos.TransporteData;
import accesoADatos.TuristaData;
import accesoADatos.CiudadData;
import accesoADatos.AlojamientoData;
import accesoADatos.HabitacionData;
import accesoADatos.PaqueteData;
import entidades.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;



public class Main {

    
    public static void main(String[] args) {
        
//      TransporteData td= new TransporteData();      
//      ArrayList<Transporte>listado = new ArrayList();
        
       PaqueteData paq = new PaqueteData();
       
       Ciudad ciudadOrigen = new Ciudad(2,"Mendoza", Boolean.TRUE); 
       Ciudad ciudadDestino = new Ciudad(11,"Salta", Boolean.TRUE); 
       Transporte transporte = new Transporte(51,ciudadOrigen, ciudadDestino, "Aut.San Juan","colectivo", 52300); 
       Alojamiento alojamiento = new Alojamiento(2,"Hotel", "ABCD", "AFFF", ciudadOrigen, 500, true, 2, 2, 2); 
       Regimen regimen = new Regimen(1,"1", 10);
       
       ArrayList<Turista> grupoBase = new ArrayList<>();
       
       Paquete paquete = new Paquete(2, ciudadOrigen, ciudadDestino, LocalDate.of(2024, 11, 7), LocalDate.of(2024, 11, 24), transporte, alojamiento, regimen, 0, grupoBase, 20000, true);
       
       paq.modificarPaquete(paquete);
       
       System.out.println("Monto Total con Penalización: " + paquete.getMontoTotal());
       
       

//        String cadena1 = "11/01/2024";
//        String cadena2 = "15/03/2024";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate fechaInicio =  LocalDate.parse(cadena1, formatter);
//        LocalDate fechaFin  =  LocalDate.parse(cadena2, formatter);
//        
//        
//        Ciudad origen = new Ciudad(1,"Mendoza", true);
//        Ciudad destino = new Ciudad(2,"Cordoba", true);
////        
//        //Transporte t1 = new Avion(8,origen, destino,"Latam", 2100);
//        Transporte t1 = new Avion(origen, destino,"Aerolineas", 2850);
//        Transporte t2 = new Avion(origen, destino,"Jet Smart", 1800);
//        Transporte t3 = new Colectivo(origen, destino,"Chevallier", 1400);

//        String cadena1 = "11/01/2024";
//        String cadena2 = "15/03/2024";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate fechaInicio =  LocalDate.parse(cadena1, formatter);
//        LocalDate fechaFin  =  LocalDate.parse(cadena2, formatter);
//        
//        
//          CiudadData cda = new CiudadData();
//        
//        Ciudad origen = new Ciudad(5,"Mendoza", fechaInicio, fechaFin, true);
//        Ciudad destino = new Ciudad(6,"Cordoba", fechaInicio, fechaFin, true);
//        
//        cda.agregarCiudad(origen);
//        cda.agregarCiudad(destino);

//        HabitacionData hab= new HabitacionData();
//        
//        Habitacion basica= new Habitacion(1, 1, 3, 5, true);
//        
//          AlojamientoData alo = new AlojamientoData();
//          Ciudad Mendoza = cda.buscarCiudad(3);
//          Alojamiento hotel = new Alojamiento(1,"2","Valle del sol","Mart3 456",Mendoza,300,true,2,2,2,basica);


        
//        Alojamiento a = alo.buscarAlojamientoPorId(1);
//        
//        int idAlojamiento= a.getIdAlojamiento();
//        hab.agregarHabitacion(basica, idAlojamiento);
        

//        
//        alo.agregarAlojamiento(hotel);
        







//         Transporte t1 = new Avion(8,origen, destino,"Latam", 2100);
//        Transporte t2 = new Colectivo(origen, destino,"Andesmar", 1000);
//        Transporte t3 = new Colectivo(origen, destino,"Cata", 1100);

//
//        td.guardarTransporte(t1);
//        td.guardarTransporte(t2);
//        
//        td.guardarTransporte(t3);
        
//        td.modificarTransporte(t1);
//        System.out.println("*** Listado de Transportes Disponibles ***");
//        for (Transporte transporte : td.buscarTransporte(origen, destino)) {
//            System.out.println(transporte.toString());
//        }

            
        

        
        
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
