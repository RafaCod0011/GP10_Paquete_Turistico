package entidades;

public class Habitacion {

    private int nroHabitacion;
    private int planta;
    private int numerac;
    private int cupo;
    private boolean estado;

    public Habitacion(int nroHabitacion, int planta, int numerac, int cupo, boolean estado) {
        this.nroHabitacion = nroHabitacion;
        this.planta = planta;
        this.numerac = numerac;
        this.cupo = cupo;
        this.estado = estado;
    }

    public int getNroHabitacion() {
        return nroHabitacion;
    }

    public void setNroHabitacion(int nroHabitacion) {
        this.nroHabitacion = nroHabitacion;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public int getNumerac() {
        return numerac;
    }

    public void setNumerac(int numerac) {
        this.numerac = numerac;
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

    @Override
    public String toString() {
        return "Habitacion{" + "nroHabitacion=" + nroHabitacion + ", planta=" + planta + ", numerac=" + numerac + ", cupo=" + cupo + ", estado=" + estado + '}';
    }
    
    
    
    
}
