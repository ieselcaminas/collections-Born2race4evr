package comparable;

import java.util.ArrayList;
import java.util.List;

public class Tareas implements Comparable<Tareas> {
    private int prioridad;
    private int duracion;
    public Tareas(int prioridad, int duracion) {
        this.prioridad = prioridad;
        this.duracion = duracion;
    }
    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return this.prioridad + " - " + this.duracion;
    }

    @Override
    public int compareTo(Tareas other) {
        if (this.prioridad - other.prioridad == 0) {
            return this.duracion - other.duracion;
        }
        return this.prioridad - other.prioridad;
    }
}
