
package entidades;


public class Cliente {
    
    private int clienteId;
    private String nombre;
    private String apellido;
    private String email;

    public Cliente(){
    }
    
    public Cliente(int clienteId, String nombre, String apellido, String email) {
        this.clienteId = clienteId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " " + email + " ";
    }
    
    
}
