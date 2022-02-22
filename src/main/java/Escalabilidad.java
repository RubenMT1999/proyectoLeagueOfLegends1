package modelos;

import java.util.Objects;

public class Escalabilidad {

    private int id;
    private static int idSiguiente;
    private double incrementoDanioNivel;
    private double incrementoDefensaNivel;
    private double incrementoSaludNivel;
    private double incrementoManaNivel;

    public Escalabilidad() {
        this.id = ++idSiguiente;
    }

    public Escalabilidad(double incrementoDanioNivel, double incrementoDefensaNivel,
                         double incrementoSaludNivel, double incrementoManaNivel) {
        this.incrementoDanioNivel = incrementoDanioNivel;
        this.incrementoDefensaNivel = incrementoDefensaNivel;
        this.incrementoSaludNivel = incrementoSaludNivel;
        this.incrementoManaNivel = incrementoManaNivel;
        this.id = ++idSiguiente;
    }

    public int getId() {
        return id;
    }


    public double getIncrementoDanioNivel() {
        return incrementoDanioNivel;
    }

    public void setIncrementoDanioNivel(double incrementoDanioNivel) {
        this.incrementoDanioNivel = incrementoDanioNivel;
    }

    public double getIncrementoDefensaNivel() {
        return incrementoDefensaNivel;
    }

    public void setIncrementoDefensaNivel(double incrementoDefensaNivel) {
        this.incrementoDefensaNivel = incrementoDefensaNivel;
    }

    public double getIncrementoSaludNivel() {
        return incrementoSaludNivel;
    }

    public void setIncrementoSaludNivel(double incrementoSaludNivel) {
        this.incrementoSaludNivel = incrementoSaludNivel;
    }

    public double getIncrementoManaNivel() {
        return incrementoManaNivel;
    }

    public void setIncrementoManaNivel(double incrementoManaNivel) {
        this.incrementoManaNivel = incrementoManaNivel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Escalabilidad that = (Escalabilidad) o;
        return id == that.id && Double.compare(that.incrementoDanioNivel, incrementoDanioNivel) == 0 && Double.compare(that.incrementoDefensaNivel, incrementoDefensaNivel) == 0 && Double.compare(that.incrementoSaludNivel, incrementoSaludNivel) == 0 && Double.compare(that.incrementoManaNivel, incrementoManaNivel) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, incrementoDanioNivel, incrementoDefensaNivel, incrementoSaludNivel, incrementoManaNivel);
    }

    @Override
    public String toString() {
        return "Escalabilidad{" +
                "id=" + id +
                ", incrementoDanioNivel=" + incrementoDanioNivel +
                ", incrementoDefensaNivel=" + incrementoDefensaNivel +
                ", incrementoSaludNivel=" + incrementoSaludNivel +
                ", incrementoManaNivel=" + incrementoManaNivel +
                '}';
    }
}
