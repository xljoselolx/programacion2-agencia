import java.util.Date;
import java.util.List;

public class Vuelo {
    private String codVuelo;
    private Date salida;
    private List<Billete> billetes;
    private Aeropuerto origen;
    private Aeropuerto Destino;

    public Vuelo(String codVuelo, Date salida, List<Billete> billetes, Aeropuerto origen, Aeropuerto destino) {
        this.codVuelo = codVuelo;
        this.salida = salida;
        this.billetes = billetes;
        this.origen = origen;
        Destino = destino;
    }

    public Vuelo(String codVuelo, Date salida, Aeropuerto origen, Aeropuerto destino) {
        this.codVuelo = codVuelo;
        this.salida = salida;
        this.origen = origen;
        Destino = destino;
    }

    public String getCodVuelo() {
        return codVuelo;
    }

    public void setCodVuelo(String codVuelo) {
        this.codVuelo = codVuelo;
    }

    public Date getSalida() {
        return salida;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

    public List<Billete> getBilletes() {
        return billetes;
    }

    public void setBilletes(List<Billete> billetes) {
        this.billetes = billetes;
    }

    public Aeropuerto getOrigen() {
        return origen;
    }

    public void setOrigen(Aeropuerto origen) {
        this.origen = origen;
    }

    public Aeropuerto getDestino() {
        return Destino;
    }

    public void setDestino(Aeropuerto destino) {
        Destino = destino;
    }
}

