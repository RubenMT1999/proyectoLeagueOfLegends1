package utilidades;

import ficheros.UtilidadesFicheros;
import modelos.Jugador;
import modelos.Partida;
import modelos.Personaje;

import java.io.IOException;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class UtilidadesPartida implements IUtilidadesPartida{

    public UtilidadesPartida() {
    }

    @Override
    public void inicializarPartida(Partida partida, List<Jugador> participantes, List<Personaje> personajesDisponibles) {


        Map<Jugador,Personaje> eleccionesdos = new HashMap<>();

        /* PARA CADA PARTICIPANTE VEMOS SI HAY UNO DE SUS PERSONAJES FAVORITOS SIN ESCOGER Y
            SI ES ASI SE LO ASIGNAMOS. SI NO HAY FAVORITOS LE DAMOS OTRO DE LOS DISPONIBLES CUALQUIERA
         */
        for (Jugador j : participantes){
            List<Personaje> favoritosDisponibles = j.getPersonajesFavoritos().stream().distinct()
                    .filter(c -> personajesDisponibles.contains(c)).collect(Collectors.toList());

            if (favoritosDisponibles.isEmpty()){
                eleccionesdos.put(j,personajesDisponibles.get(0));
                personajesDisponibles.remove(0);
            }else {
                eleccionesdos.put(j,favoritosDisponibles.get(0));
                personajesDisponibles.remove(favoritosDisponibles.get(0));
            }
        }

        partida.setElecciones(eleccionesdos);

        //FORMAR EQUIPOS. COJEMOS DOS SETS Y VAMOS INSERTANDO EN AMBOS LOS PARTICIPANTES

        Map<Integer, Set<Jugador>> formarEquipo = new HashMap<>();

        Set<Jugador> equipo1 = new HashSet<>();
        Set<Jugador> equipo2 = new HashSet<>();


        int comprobarPares = participantes.size();

        if (comprobarPares%2 == 0){
            for (Jugador j : participantes){

                if (equipo1.size() == equipo2.size()){
                    equipo1.add(j);
                }
                else {
                    equipo2.add(j);

                }
            }

            formarEquipo.put(1,equipo1);
            formarEquipo.put(2,equipo2);
            partida.setJugadoresPorEquipo(formarEquipo);
        }


        partida.setInicioPartida(LocalDateTime.now());

    }

    @Override
    public void finalizarPartida(Partida partida, Integer equipoVencedor) {

        partida.setFinPartida(LocalDateTime.now());
        int segundosInicio = partida.getInicioPartida().getSecond();
        int segundosFin = partida.getFinPartida().getSecond();
        int duracionPartida = segundosFin - segundosInicio;

        partida.setDuracionPartida(duracionPartida);

        partida.setEquipoVencedor(equipoVencedor);



//EXCEPCION NULLPOINTER POR TENER JUGADORES CON PARTIDAS GANADAS EN NULL
        try{
            for (Jugador e : partida.getJugadoresPorEquipo().get(equipoVencedor)){

                Personaje personajeElegido = partida.getElecciones().get(e);

                Integer i = e.getPartidasGanadas().get(personajeElegido);

                e.getPartidasGanadas().put(partida.getElecciones().get(e), i+1);
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
