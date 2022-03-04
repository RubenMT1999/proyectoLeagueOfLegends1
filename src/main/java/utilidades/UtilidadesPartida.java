package utilidades;

import ficheros.UtilidadesFicheros;
import modelos.Jugador;
import modelos.Partida;
import modelos.Personaje;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UtilidadesPartida implements IUtilidadesPartida{

    public UtilidadesPartida() {
    }

    @Override
    public void inicializarPartida(Partida partida, List<Jugador> participantes, List<Personaje> personajesDisponibles) {


        Map<Jugador,Personaje> elecciones = partida.getElecciones();


        for (Jugador j : participantes){
            List<Personaje> favoritosDisponibles = j.getPersonajesFavoritos().stream().distinct()
                    .filter(c -> personajesDisponibles.contains(c)).collect(Collectors.toList());

            if (favoritosDisponibles.isEmpty()){
                elecciones.put(j,personajesDisponibles.get(0));
                personajesDisponibles.remove(0);
            }else {
                elecciones.put(j,favoritosDisponibles.get(0));
                personajesDisponibles.remove(favoritosDisponibles.get(0));
            }




        }




    }

    @Override
    public void finalizarPartida(Partida partida, Integer equipoVencedor) {

    }
}
