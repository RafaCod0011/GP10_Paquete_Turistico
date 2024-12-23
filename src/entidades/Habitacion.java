package entidades;

public class Habitacion {

    private int idAlojamiento;
    private int idHabitacion;
    private int planta;
    private int numHab;
    private int cupo;
    private boolean estado;

    public Habitacion(int idAlojamiento, int idHabitacion, int planta, int numHab, int cupo, boolean estado) {
        this.idAlojamiento = idAlojamiento;
        this.idHabitacion = idHabitacion;
        this.planta = planta;
        this.numHab = numHab;
        this.cupo = cupo;
        this.estado = estado;
    }
    public Habitacion(int idHabitacion, int planta, int numHab, int cupo, boolean estado) {
        this.idHabitacion = idHabitacion;
        this.planta = planta;
        this.numHab = numHab;
        this.cupo = cupo;
        this.estado = estado;
    }

    public Habitacion(int planta, int numHab, int cupo, boolean estado) {
        this.planta = planta;
        this.numHab = numHab;
        this.cupo = cupo;
        this.estado = estado;
    }
    
    public Habitacion(){
        
    }
    
    public int getIdAlojamiento() {
        return idAlojamiento;
    }

    public void setIdAlojamiento(int idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
    }
  
    public int getNroHabitacion() {
        return idHabitacion;
    }

    public void setNroHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public int getNumerac() {
        return numHab;
    }

    public void setNumerac(int numHab) {
        this.numHab = numHab;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getNumHab() {
        return numHab;
    }

    public void setNumHab(int numHab) {
        this.numHab = numHab;
    }

    
    @Override
    public String toString() {
        return "Habitacion{" + "idHabitacion=" + idHabitacion + ", planta=" + planta + ", numHab=" + numHab + ", cupo=" + cupo + ", estado=" + estado + '}';
    }
    
    
    
    
}
