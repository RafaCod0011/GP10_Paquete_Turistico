
package Vistas;

import accesoADatos.ClienteData;
import entidades.Cliente;
/**
 *
 * @author Rafa
 */
public class Main {

    
    public static void main(String[] args) {
        
        ClienteData cd= new ClienteData();
        
        Cliente nuevoCliente= new Cliente(1, "Rafael", "Cuello", "abcd@gmail.com");
        
        cd.guardarCliente(nuevoCliente);
        
        
        
    }
    
}
