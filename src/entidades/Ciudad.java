package entidades;

import java.time.LocalDate;

public class Ciudad {

    private int idCiudad;
    private String nombre;
    private LocalDate fechaInicioTemporada;
    private LocalDate fechaFinTemporada;
    private Boolean destinoActivo;

    public Ciudad(int idCiudad, String nombre, LocalDate fechaInicioTemporada, LocalDate fechaFinTemporada, Boolean destinoActivo) {
        this.idCiudad = idCiudad;
        this.nombre = nombre;
        this.fechaInicioTemporada = fechaInicioTemporada;
        this.fechaFinTemporada = fechaFinTemporada;
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

    public LocalDate getFechaInicioTemporada() {
        return fechaInicioTemporada;
    }

    public void setFechaInicioTemporada(LocalDate fechaInicioTemporada) {
        this.fechaInicioTemporada = fechaInicioTemporada;
    }

    public LocalDate getFechaFinTemporada() {
        return fechaFinTemporada;
    }

    public void setFechaFinTemporada(LocalDate fechaFinTemporada) {
        this.fechaFinTemporada = fechaFinTemporada;
    }

    public Boolean getDestinoActivo() {
        return destinoActivo;
    }

    public void setDestinoActivo(Boolean destinoActivo) {
        this.destinoActivo = destinoActivo;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "idCiudad=" + idCiudad + ", nombre=" + nombre + ", fechaInicioTemporada=" + fechaInicioTemporada + ", fechaFinTemporada=" + fechaFinTemporada + ", destinoActivo=" + destinoActivo + '}';
    }
    
    


}
