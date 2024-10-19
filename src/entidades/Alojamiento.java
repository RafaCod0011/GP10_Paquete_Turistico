package entidades;

public class Alojamiento {

    private int idAlojamiento;
    private int idTipoAlojamiento;
    private String nombre;
    private String direccion;
    private Ciudad ciudad;
    private double precioNoche;
    private boolean activo;
    private int capacidad;
    private int camas;
    private int banios;
    private Habitacion habitaciones;

    public Alojamiento(int idAlojamiento, int idTipoAlojamiento, String nombre, String direccion, Ciudad ciudad, double precioNoche, boolean activo, int capacidad, int camas, int banios, Habitacion habitaciones) {
        this.idAlojamiento = idAlojamiento;
        this.idTipoAlojamiento = idTipoAlojamiento;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.precioNoche = precioNoche;
        this.activo = activo;
        this.capacidad = capacidad;
        this.camas = camas;
        this.banios = banios;
        this.habitaciones = habitaciones;
    }

        
    public Alojamiento() {
    }
    
    
    public int getIdAlojamiento() {
        return idAlojamiento;
    }

    public void setIdAlojamiento(int idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
    }

    public int getIdTipoAlojamiento() {
        return idTipoAlojamiento;
    }

    public void setIdTipoAlojamiento(int idTipoAlojamiento) {
        this.idTipoAlojamiento = idTipoAlojamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }

    public int getBanios() {
        return banios;
    }

    public void setBanios(int banios) {
        this.banios = banios;
    }

    public Habitacion getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Habitacion habitaciones) {
        this.habitaciones = habitaciones;
    }

    
    


  
}
