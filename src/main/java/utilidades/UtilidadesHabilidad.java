package utilidades;

import modelos.*;

public class UtilidadesHabilidad {

    public UtilidadesHabilidad() {
    }



    public static void golpearConHabilidad(Personaje emisor, Personaje receptor, Habilidad habilidadEmisor){

        //SUBIMOS AL 18 A AMBOS PERSONAJES.
        while (emisor.getNivel() <18){
            UtilidadesPersonaje.levelUp(emisor);
        }

        while (receptor.getNivel() <18){
            UtilidadesPersonaje.levelUp(receptor);
        }

        //ACTUALIZAMOS LOS STATS SEGUN LOS ITEMS
        for (Item i : emisor.getEquipamiento()){
            emisor.setAtaque(emisor.getAtaque()+i.getAumentoDanio());
            emisor.setDefensa(emisor.getDefensa()+i.getAumentoDefensa());
            emisor.setVida(emisor.getVida()+i.getAumentoSalud());
            emisor.setMana(emisor.getMana()+i.getAumentoMana());
        }

        for (Item e : receptor.getEquipamiento()){
            receptor.setAtaque(receptor.getAtaque()+e.getAumentoDanio());
            receptor.setDefensa(receptor.getDefensa()+e.getAumentoDefensa());
            receptor.setVida(receptor.getVida()+e.getAumentoSalud());
            receptor.setMana(receptor.getMana()+e.getAumentoMana());
        }

    }
}
