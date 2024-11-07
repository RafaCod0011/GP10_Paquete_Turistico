package entidades;

public class Turista {

    private int idTurista;
    private int documento;
    private String fullName;
    private int edad;
    private int cantidadPaquetes;  // nueva variable para la cant de paqutes x turista

    public Turista(int idTurista, int documento, String fullName, int edad) {
        this.idTurista = idTurista;
        this.documento = documento;
        this.fullName = fullName;
        this.edad = edad;
    }

    public Turista(int documento, String fullName, int edad) {
        this.documento = documento;
        this.fullName = fullName;
        this.edad = edad;
    }
   
   
    public Turista() {
    }

    public int getIdTurista() {
        return idTurista;
    }

    public void setIdTurista(int idTurista) {
        this.idTurista = idTurista;
    }
    
    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantidadPaquetes() { //trae cantidad de paquetes
        return cantidadPaquetes;
    }

    public void setCantidadPaquetes(int cantidadPaquetes) { //setea cantidad de paquetes
        this.cantidadPaquetes = cantidadPaquetes;
    }
    
    @Override
    public String toString() {
        return fullName + " - "  + documento + " - " + edad + " años";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Turista other = (Turista) obj;
        return this.documento == other.documento;
    }
}

