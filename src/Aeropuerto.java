public class Aeropuerto {
    private String codAeropuerto;
    private String nombre;
    private Ciudad ciudad;

    public Aeropuerto(String codAeropuerto, String nombre, Ciudad ciudad) {
        this.codAeropuerto = codAeropuerto;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String getCodAeropuerto() {
        return codAeropuerto;
    }

    public void setCodAeropuerto(String codAeropuerto) {
        this.codAeropuerto = codAeropuerto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
}
