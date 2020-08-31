import com.sun.xml.internal.ws.client.ClientTransportException;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //cliente
        Cliente carlos = new Cliente(1,"carlos","peres","vargas");

        //ciudad
        Ciudad cochabamba = new Ciudad(1,"cochabamba");
        Ciudad santaCruz = new Ciudad(2,"santa Cruz");
        Ciudad tarija = new Ciudad(3,"tarija");

        //categoria
        Categoria turista=new Categoria(1,"turista");

        //aeropuertos
        Aeropuerto jorgeWilstermann=new Aeropuerto("JW","Jorge Wilstermann camacho",cochabamba);
        Aeropuerto viruViru=new Aeropuerto("VV","Viru Viru",santaCruz);
        Aeropuerto orielLea=new Aeropuerto("OL","oriel lea plaza",tarija);

        //vuelos
        List<Vuelo> vuelos=new ArrayList<>();
        Vuelo cochabambaSantaCruz=new Vuelo("BOA-158", Calendar.getInstance().getTime(),jorgeWilstermann,viruViru);
        vuelos.add(cochabambaSantaCruz);
        Vuelo santaCruzTarija=new Vuelo("BOA-159",Calendar.getInstance().getTime(),viruViru,orielLea);
        vuelos.add(santaCruzTarija);

        //billete
        Billete billete=new Billete(1,Calendar.getInstance().getTime(),650.5,carlos,cochabamba,tarija,turista,vuelos);

        System.out.println("BILLETE");
        System.out.println("==========");
        System.out.println("Id:"+ billete.getIdBillete());
        System.out.println("Fecha: "+ billete.getFechaEmision());
        System.out.println("Precio total:" + billete.getPrecioTotal());
        System.out.println("cliente:" + billete.getCliente().getNombre());
        System.out.println("origen: " +billete.getOrigen().getNombre());
        System.out.println("destino: "+ billete.getDestino().getNombre());
        System.out.println("ctegoria: " +billete.getCategoria().getNombre());
        System.out.println("vuelos: ");
        for (Vuelo vuelo:billete.getVuelos()) {
            System.out.println("Codigo vuelo: "+ vuelo.getCodVuelo() + "| Salida: " +vuelo.getSalida()  + "|Origen: " +vuelo.getOrigen().getNombre() + "|Destino: " +vuelo.getDestino().getNombre());

        }
    }
}
