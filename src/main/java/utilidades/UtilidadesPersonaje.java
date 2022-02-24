package utilidades;

import modelos.*;

import java.util.*;
import java.util.stream.Collectors;

public class UtilidadesPersonaje {


    public static Personaje levelUp(Personaje personaje){

        int nivelPrueba = personaje.getNivel();
        personaje.setNivel(nivelPrueba+1);

        int nivelNuevo = personaje.getNivel() +1;

        personaje.setAtaque(personaje.getAtaqueBase() + personaje.getEscalabilidad().getIncrementoDanioNivel()
                                * nivelNuevo);
        personaje.setDefensa(personaje.getDefensaBase() + personaje.getEscalabilidad().getIncrementoDefensaNivel()
                                * nivelNuevo);
        personaje.setVida(personaje.getVidaBase() + personaje.getEscalabilidad().getIncrementoSaludNivel()
                                * nivelNuevo);
        personaje.setMana(personaje.getManaBase() + personaje.getEscalabilidad().getIncrementoManaNivel()
                                * nivelNuevo);

        return personaje;

    }

    public static Personaje levelDown(Personaje personaje){

        int nivelPrueba = personaje.getNivel();
        personaje.setNivel(nivelPrueba-1);

        int nivelNuevo = personaje.getNivel() - 1;

        personaje.setAtaque(personaje.getAtaqueBase() + personaje.getEscalabilidad().getIncrementoDanioNivel()
                * nivelNuevo);
        personaje.setDefensa(personaje.getDefensaBase() + personaje.getEscalabilidad().getIncrementoDefensaNivel()
                * nivelNuevo);
        personaje.setVida(personaje.getVidaBase() + personaje.getEscalabilidad().getIncrementoSaludNivel()
                * nivelNuevo);
        personaje.setMana(personaje.getManaBase() + personaje.getEscalabilidad().getIncrementoManaNivel()
                * nivelNuevo);

        return personaje;

    }



    public static Map<Region, List<Personaje>> getPersonajesPorRegion(List<Personaje> personajes){

        Map <Region, List<Personaje>> miMapa = personajes.stream().collect(Collectors.groupingBy
                (p -> p.getRegion()));

        return miMapa;

    }



    public static Personaje getMasPoderoso(List<Personaje> personaje){

        double sumatorio = 0;
        Personaje p1 = null;

        for (Personaje p : personaje){
            for (int i = p.getNivel(); i<18; i++){
                levelUp(p);
            }
        }

        for (Personaje e : personaje){
            double sumaPrueba = (e.getAtaque()+e.getDefensa()+e.getVida()+e.getMana());
            if (sumaPrueba > sumatorio){
                p1 = e;
                sumatorio = sumaPrueba;
                sumaPrueba = 0;
            }
            else {
                sumaPrueba = 0;
            }
        }

        return p1;

    }




    public static Map<Region, Personaje> getMasPoderosoPorRegion(List<Personaje> personajes){

        Map<Region, List<Personaje>> miMapa1 = getPersonajesPorRegion(personajes);

       //miMapa1.values().forEach(v-> getMasPoderoso(v));


        Map<Region, Personaje> miPrueba = new HashMap<>();

        for (Map.Entry<Region, List<Personaje>> entry : miMapa1.entrySet()){
            Personaje p1 = getMasPoderoso(entry.getValue());

            miPrueba.put(entry.getKey(),p1);
            p1 = null;
        }


       return miPrueba;

        }


    }





