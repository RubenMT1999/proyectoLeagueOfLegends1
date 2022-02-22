package modelos;

import java.util.Objects;

public class Item {

    private int id;
    private  static int idSiguiente;
    private String danio;
    private double aumentoDanio;
    private double aumentoDefensa;
    private double aumentoSalud;
    private double aumentoMana;


    public Item() {
        this.id = ++idSiguiente;
    }

    public Item(String danio, double aumentoDanio, double aumentoDefensa,
                double aumentoSalud, double aumentoMana) {
        this.danio = danio;
        this.aumentoDanio = aumentoDanio;
        this.aumentoDefensa = aumentoDefensa;
        this.aumentoSalud = aumentoSalud;
        this.aumentoMana = aumentoMana;
        this.id = ++idSiguiente;
    }


    public int getId() {
        return id;
    }


    public String getDanio() {
        return danio;
    }

    public void setDanio(String danio) {
        this.danio = danio;
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
        return id == item.id && Double.compare(item.aumentoDanio, aumentoDanio) == 0 && Double.compare(item.aumentoDefensa, aumentoDefensa) == 0 && Double.compare(item.aumentoSalud, aumentoSalud) == 0 && Double.compare(item.aumentoMana, aumentoMana) == 0 && Objects.equals(danio, item.danio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, danio, aumentoDanio, aumentoDefensa, aumentoSalud, aumentoMana);
    }


    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", danio='" + danio + '\'' +
                ", aumentoDanio=" + aumentoDanio +
                ", aumentoDefensa=" + aumentoDefensa +
                ", aumentoSalud=" + aumentoSalud +
                ", aumentoMana=" + aumentoMana +
                '}';
    }
}
