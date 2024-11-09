package entidades;

import java.util.Objects;

public class Ciudad {

    private int idCiudad;
    private String nombre;
    private Boolean destinoActivo;

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
