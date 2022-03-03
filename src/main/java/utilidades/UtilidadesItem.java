package utilidades;

import modelos.Item;
import modelos.Personaje;

import java.util.ArrayList;
import java.util.List;

public class UtilidadesItem {

    public UtilidadesItem() {
    }



    public static void equiparItem(Personaje personaje, Item item){

        //EN ESTA LISTA METEMOS EL EQUIPAMIENTO QUE YA POSEE EL PERSONAJE Y LUEGO ANIADIMOS EL NUEVO ITEM

        List<Item> miLista = new ArrayList<>();

        for (Item i : personaje.getEquipamiento()){
            miLista.add(i);
        }

        miLista.add(item);

        personaje.setEquipamiento(miLista);

        //ACTUALIZAMOS LAS CARACTERISTICAS DEL PERSONAJE

        personaje.setAtaque(personaje.getAtaque()+item.getAumentoDanio());
        personaje.setDefensa(personaje.getDefensa()+item.getAumentoDefensa());
        personaje.setVida(personaje.getVida()+item.getAumentoSalud());
        personaje.setMana(personaje.getMana()+item.getAumentoMana());

    }




}
