package utilidades;

import modelos.*;

import java.io.IOException;
import java.util.List;

public interface IUtilidadesPartida {

    void inicializarPartida(Partida partida, List<Jugador>
            participantes, List<Personaje> personajesDisponibles);

    void finalizarPartida(Partida partida, Integer equipoVencedor);

}
