import ficheros.UtilidadesFicheros;
import modelos.*;
import utilidades.UtilidadesPartida;
import utilidades.UtilidadesPersonaje;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

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



        Partida partida1 = new Partida("JOPW90",32.543, null,
                null,null,null,0,null);

        Partida partida2 = new Partida("IFGI892",32.543, null,
                null,null,null,0,null);


        Set<Personaje> miSetFavoritos1 = new HashSet<>();
        miSetFavoritos1.add(p1);
        miSetFavoritos1.add(p2);

        Set<Personaje> miSetFavoritos2 = new HashSet<>();
        miSetFavoritos2.add(p2);
        miSetFavoritos2.add(p3);

        Map<Personaje,Integer> ganadasJ3 = new HashMap<>();
        ganadasJ3.put(p3, 2);

        Jugador j1 = new Jugador("patg01",miSetFavoritos1,null);
        Jugador j2 = new Jugador("contor",miSetFavoritos1,null);
        Jugador j3 = new Jugador("davidp",miSetFavoritos2,ganadasJ3);
        Jugador j4 = new Jugador("xpeke",miSetFavoritos2,null);



        List<Jugador> listaJugadores = new ArrayList<>();
        listaJugadores.add(j1);
        listaJugadores.add(j2);
        listaJugadores.add(j3);
        listaJugadores.add(j4);

        //System.out.println(UtilidadesPersonaje.getMasPoderoso(miLista1));

        /*
       try {
            System.out.println(UtilidadesFicheros.leerFicheroPersonajes());
        }catch (Exception e ){
            System.out.println("error");
        }
        */

       UtilidadesPartida uP1 = new UtilidadesPartida();
      // uP1.inicializarPartida(partida1,listaJugadores,miLista1);
       //uP1.finalizarPartida(partida1,1);
      // System.out.println(partida1.getDuracionPartida());
        //System.out.println(partida1.getInicioPartida());
        //System.out.println(partida1.getFinPartida());
        //System.out.println(partida1.getElecciones().get(j1));
        //System.out.println(partida1.getJugadoresPorEquipo().get(1));

       // uP1.finalizarPartida(partida1,1);
       // System.out.println(j3.getPartidasGanadas());

        List<Personaje> miLista2 = new ArrayList<>();
        miLista2.add(p1);
        miLista2.add(p2);
        miLista2.add(p3);
        miLista2.add(p4);


        //uP1.inicializarPartida(partida2,listaJugadores,miLista2);
       // uP1.finalizarPartida(partida2,1);
        //System.out.println(j3.getPartidasGanadas());
        try{
            System.out.println(UtilidadesFicheros.leerYAprenderHabilidades());
        }catch (Exception e){
            System.out.println("error");
        }






    }
}
