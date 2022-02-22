package modelos;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Personaje {

    private int id;
    private static int idSiguiente;
    private String nombre;
    private String descripcion;
    private LocalDate fechaCreacion;
    private int nivel;
    private double vidaBase;
    private double manaBase;
    private double defensaBase;
    private double defensa;
    private double ataqueBase;
    private double ataque;
    private double vida;
    private double mana;
    private Region region;
    private List<modelos.Habilidad> habilidades;
    private List<modelos.Item> equipamiento;
    private modelos.Escalabilidad escalabilidad;


    public Personaje() {
        this.id = ++ idSiguiente;
    }

    public Personaje(String nombre, String descripcion, LocalDate fechaCreacion, int nivel, double vidaBase,
                     double manaBase, double defensaBase, double defensa, double ataqueBase, double ataque,
                     double vida, double mana, Region region, List<modelos.Habilidad> habilidades, List<modelos.Item> equipamiento,
                     modelos.Escalabilidad escalabilidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.nivel = nivel;
        this.vidaBase = vidaBase;
        this.manaBase = manaBase;
        this.defensaBase = defensaBase;
        this.defensa = defensa;
        this.ataqueBase = ataqueBase;
        this.ataque = ataque;
        this.vida = vida;
        this.mana = mana;
        this.region = region;
        this.habilidades = habilidades;
        this.equipamiento = equipamiento;
        this.escalabilidad = escalabilidad;
        this.id = ++idSiguiente;
    }

    public int getId() {
        return id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getVidaBase() {
        return vidaBase;
    }

    public void setVidaBase(double vidaBase) {
        this.vidaBase = vidaBase;
    }

    public double getManaBase() {
        return manaBase;
    }

    public void setManaBase(double manaBase) {
        this.manaBase = manaBase;
    }

    public double getDefensaBase() {
        return defensaBase;
    }

    public void setDefensaBase(double defensaBase) {
        this.defensaBase = defensaBase;
    }

    public double getDefensa() {
        return defensa;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    public double getAtaqueBase() {
        return ataqueBase;
    }

    public void setAtaqueBase(double ataqueBase) {
        this.ataqueBase = ataqueBase;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public List<modelos.Habilidad> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<modelos.Habilidad> habilidades) {
        this.habilidades = habilidades;
    }

    public List<modelos.Item> getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(List<modelos.Item> equipamiento) {
        this.equipamiento = equipamiento;
    }

    public modelos.Escalabilidad getEscalabilidad() {
        return escalabilidad;
    }

    public void setEscalabilidad(modelos.Escalabilidad escalabilidad) {
        this.escalabilidad = escalabilidad;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return id == personaje.id && nivel == personaje.nivel && Double.compare(personaje.vidaBase, vidaBase) == 0 && Double.compare(personaje.manaBase, manaBase) == 0 && Double.compare(personaje.defensaBase, defensaBase) == 0 && Double.compare(personaje.defensa, defensa) == 0 && Double.compare(personaje.ataqueBase, ataqueBase) == 0 && Double.compare(personaje.ataque, ataque) == 0 && Double.compare(personaje.vida, vida) == 0 && Double.compare(personaje.mana, mana) == 0 && Objects.equals(nombre, personaje.nombre) && Objects.equals(descripcion, personaje.descripcion) && Objects.equals(fechaCreacion, personaje.fechaCreacion) && Objects.equals(region, personaje.region) && Objects.equals(habilidades, personaje.habilidades) && Objects.equals(equipamiento, personaje.equipamiento) && Objects.equals(escalabilidad, personaje.escalabilidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, descripcion, fechaCreacion, nivel, vidaBase, manaBase, defensaBase, defensa, ataqueBase, ataque, vida, mana, region, habilidades, equipamiento, escalabilidad);
    }


    @Override
    public String toString() {
        return "Personaje{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", nivel=" + nivel +
                ", vidaBase=" + vidaBase +
                ", manaBase=" + manaBase +
                ", defensaBase=" + defensaBase +
                ", defensa=" + defensa +
                ", ataqueBase=" + ataqueBase +
                ", ataque=" + ataque +
                ", vida=" + vida +
                ", mana=" + mana +
                ", region=" + region +
                ", habilidades=" + habilidades +
                ", equipamiento=" + equipamiento +
                ", escalabilidad=" + escalabilidad +
                '}';
    }
}
