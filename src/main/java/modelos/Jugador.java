package modelos;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Jugador {

    private static int idSiguiente;
    private int id;
    private String nickname;
    private Set<Personaje> personajesFavoritos;
    private Map<Personaje,Integer> partidasGanadas;


    public Jugador() {
        this.id = ++idSiguiente;
    }

    public Jugador(String nickname, Set<Personaje> personajesFavoritos, Map<Personaje, Integer> partidasGanadas) {
        this.nickname = nickname;
        this.personajesFavoritos = personajesFavoritos;
        this.partidasGanadas = partidasGanadas;
        this.id = ++idSiguiente;
    }

    public Jugador(Jugador jugador){
        this.nickname = jugador.nickname;
        this.personajesFavoritos = jugador.personajesFavoritos;
        this.partidasGanadas = jugador.partidasGanadas;
        this.id = ++idSiguiente;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Set<Personaje> getPersonajesFavoritos() {
        return personajesFavoritos;
    }

    public void setPersonajesFavoritos(Set<Personaje> personajesFavoritos) {
        this.personajesFavoritos = personajesFavoritos;
    }

    public Map<Personaje, Integer> getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(Map<Personaje, Integer> partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return id == jugador.id && Objects.equals(nickname, jugador.nickname) && Objects.equals(personajesFavoritos, jugador.personajesFavoritos) && Objects.equals(partidasGanadas, jugador.partidasGanadas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nickname, personajesFavoritos, partidasGanadas);
    }


    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", personajesFavoritos=" + personajesFavoritos +
                ", partidasGanadas=" + partidasGanadas +
                '}';
    }
}
