package entidades;

public class Turista {

    private int idTurista;
    private int documento;
    private String fullName;
    private int edad;

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

    @Override
    public String toString() {
        return fullName + " - "  + documento + " - " + edad + " años";
    }


}
