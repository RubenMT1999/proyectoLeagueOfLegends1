package modelos;

import java.util.Objects;

public class Item {

    private int id;
    private  static int idSiguiente;
    private String nombre;
    private double aumentoDanio;
    private double aumentoDefensa;
    private double aumentoSalud;
    private double aumentoMana;


    public Item() {
        this.id = ++idSiguiente;
    }

    public Item(String nombre, double aumentoDanio, double aumentoDefensa,
                double aumentoSalud, double aumentoMana) {
        this.nombre = nombre;
        this.aumentoDanio = aumentoDanio;
        this.aumentoDefensa = aumentoDefensa;
        this.aumentoSalud = aumentoSalud;
        this.aumentoMana = aumentoMana;
        this.id = ++idSiguiente;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAumentoDanio() {
        return aumentoDanio;
    }

    public void setAumentoDanio(double aumentoDanio) {
        this.aumentoDanio = aumentoDanio;
    }

    public double getAumentoDefensa() {
        return aumentoDefensa;
    }

    public void setAumentoDefensa(double aumentoDefensa) {
        this.aumentoDefensa = aumentoDefensa;
    }

    public double getAumentoSalud() {
        return aumentoSalud;
    }

    public void setAumentoSalud(double aumentoSalud) {
        this.aumentoSalud = aumentoSalud;
    }

    public double getAumentoMana() {
        return aumentoMana;
    }

    public void setAumentoMana(double aumentoMana) {
        this.aumentoMana = aumentoMana;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id && Double.compare(item.aumentoDanio, aumentoDanio) == 0 && Double.compare(item.aumentoDefensa, aumentoDefensa) == 0 && Double.compare(item.aumentoSalud, aumentoSalud) == 0 && Double.compare(item.aumentoMana, aumentoMana) == 0 && Objects.equals(nombre, item.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, aumentoDanio, aumentoDefensa, aumentoSalud, aumentoMana);
    }


    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", danio='" + nombre + '\'' +
                ", aumentoDanio=" + aumentoDanio +
                ", aumentoDefensa=" + aumentoDefensa +
                ", aumentoSalud=" + aumentoSalud +
                ", aumentoMana=" + aumentoMana +
                '}';
    }
}
