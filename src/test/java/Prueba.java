import ficheros.UtilidadesFicheros;
import modelos.Escalabilidad;
import modelos.Personaje;
import modelos.Region;
import utilidades.UtilidadesPersonaje;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Prueba {


    public static void main(String[] args) {

        Escalabilidad e1 = new Escalabilidad(4.5,6.00,54.00,70.00);
        Escalabilidad e2 = new Escalabilidad(6.00,10.00,80.00,30.00);
        Escalabilidad e3 = new Escalabilidad(8.00,4.00,51.00,70.00);
        Escalabilidad e4 = new Escalabilidad(4.8,6.00,40.00,90.00);

        Personaje p1 = new Personaje("Amumu","Enano cabezon", LocalDate.of(2010,9,20),16,
                50.00,50.00,50.00,50.00,50.00,50.00,
                50.00,50.00, Region.FREIJORD,null,null,e1);

        Personaje p2 = new Personaje("Dr.Mundo","Ciclado", LocalDate.of(2010,9,20),16,
                60.00,60.00,60.00,60.00,60.00,60.00,
                60.00,60.00,Region.JONIA,null,null,e1);

        Personaje p3 = new Personaje("Maestro Yi","auto, q", LocalDate.of(2010,9,20),16,
                70.00,70.00,70.00,70.00,70.00,70.00,
                70.00,70.00,Region.JONIA,null,null,e1);

        Personaje p4 = new Personaje("Lux","Luz", LocalDate.of(2010,9,20),16,
                80.00,80.00,80.00,80.00,80.00,80.00,
                80.00,80.00,Region.FREIJORD,null,null,e1);

        List<Personaje> miLista1 = new ArrayList<>();
        miLista1.add(p1);
        miLista1.add(p2);
        miLista1.add(p3);
        miLista1.add(p4);


        //System.out.println(UtilidadesPersonaje.getMasPoderoso(miLista1));

        /*
       try {
            System.out.println(UtilidadesFicheros.leerFicheroPersonajes());
        }catch (Exception e ){
            System.out.println("error");
        }
        */

        try {
            System.out.println(UtilidadesFicheros.leerItems());
        }catch (Exception e ){
            System.out.println("error");
        }


    }
}
