package entidades;

public class CiudadVisitada {
    private int idCiudad;
    private String nombreCiudad;
    private int totalTuristas;
    private int cantidadPaquetes;

    public CiudadVisitada(int idCiudad, String nombreCiudad, int totalTuristas, int cantidadPaquetes) {
        this.idCiudad = idCiudad;
        this.nombreCiudad = nombreCiudad;
        this.totalTuristas = totalTuristas;
        this.cantidadPaquetes = cantidadPaquetes;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public int getTotalTuristas() {
        return totalTuristas;
    }

    public int getCantidadPaquetes() {
        return cantidadPaquetes;
    }
}
