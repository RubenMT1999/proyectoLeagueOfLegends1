package modelos;

import java.util.Objects;

public class Habilidad {

    private int id;
    private static int idSiguiente;
    private String nombre;
    private double danioBase;
    private double danio;
    private double costeMana;
    private TipoHabilidad tipoHabilidad;


    public Habilidad() {
        this.id=++idSiguiente;
    }

    public Habilidad(String nombre, double danioBase, double danio,
                     double costeMana, TipoHabilidad tipoHabilidad) {
        this.nombre = nombre;
        this.danioBase = danioBase;
        this.danio = danio;
        this.costeMana = costeMana;
        this.tipoHabilidad = tipoHabilidad;
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

    public double getDanioBase() {
        return danioBase;
    }

    public void setDanioBase(double danioBase) {
        this.danioBase = danioBase;
    }

    public double getDanio() {
        return danio;
    }

    public void setDanio(double danio) {
        this.danio = danio;
    }

    public double getCosteMana() {
        return costeMana;
    }

    public void setCosteMana(double costeMana) {
        this.costeMana = costeMana;
    }

    public TipoHabilidad getTipoHabilidad() {
        return tipoHabilidad;
    }

    public void setTipoHabilidad(TipoHabilidad tipoHabilidad) {
        this.tipoHabilidad = tipoHabilidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Habilidad habilidad = (Habilidad) o;
        return id == habilidad.id && Double.compare(habilidad.danioBase, danioBase) == 0 && Double.compare(habilidad.danio, danio) == 0 && Double.compare(habilidad.costeMana, costeMana) == 0 && Objects.equals(nombre, habilidad.nombre) && Objects.equals(tipoHabilidad, habilidad.tipoHabilidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, danioBase, danio, costeMana, tipoHabilidad);
    }


    @Override
    public String toString() {
        return "Habilidad{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", danioBase=" + danioBase +
                ", danio=" + danio +
                ", costeMana=" + costeMana +
                ", tipoHabilidad=" + tipoHabilidad +
                '}';
    }
}
