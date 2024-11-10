package entidades;

import java.util.Objects;

public class Ciudad {

    private int idCiudad;
    private String nombre;
    private Boolean destinoActivo;
    private int totalTuristas;
    private int totalPaquetes;

    public Ciudad(int idCiudad, String nombre, Boolean destinoActivo) {
        this.idCiudad = idCiudad;
        this.nombre = nombre;
        this.destinoActivo = destinoActivo;
    }

    public Ciudad(String nombre, Boolean destinoActivo) {
        this.nombre = nombre;
        this.destinoActivo = destinoActivo;
    }
    

    public Ciudad() {
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getDestinoActivo() {
        return destinoActivo;
    }

    public void setDestinoActivo(Boolean destinoActivo) {   
        this.destinoActivo = destinoActivo;
    }

    // Getter y Setter para totalTuristas
    public int getTotalTuristas() {
        return totalTuristas;
    }

    public void setTotalTuristas(int totalTuristas) {
        this.totalTuristas = totalTuristas;
    }

    // Getter y Setter para totalPaquetes
    public int getTotalPaquetes() {
        return totalPaquetes;
    }

    public void setTotalPaquetes(int totalPaquetes) {
        this.totalPaquetes = totalPaquetes;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Ciudad ciudad = (Ciudad) obj;
        return this.getNombre().equals(ciudad.getNombre()); 
    }


    @Override
    public int hashCode() {
        return Objects.hash(nombre);  
    }
}
