package entidades;

public class Regimen {

    private int idRegimen;
    private String denominacion;
    private double cargoExtra;

    public Regimen(int idRegimen, String denominacion, double cargoExtra) {
        this.idRegimen = idRegimen;
        this.denominacion = denominacion;
        this.cargoExtra = cargoExtra;
    }

    public Regimen(String denominacion, double cargoExtra) {
        this.denominacion = denominacion;
        this.cargoExtra = cargoExtra;
    }
    

    public int getIdRegimen() {
        return idRegimen;
    }

    public void setIdRegimen(int idRegimen) {
        this.idRegimen = idRegimen;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public double getCargoExtra() {
        return cargoExtra;
    }

    public void setCargoExtra(double cargoExtra) {
        this.cargoExtra = cargoExtra;
    }

    @Override
    public String toString() {
        return "Regimen{" + "idRegimen=" + idRegimen + ", denominacion=" + denominacion + ", cargoExtra=" + cargoExtra + '}';
    }

    
    


}
