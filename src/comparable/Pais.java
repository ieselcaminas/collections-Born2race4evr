package comparable;

public class Pais implements Comparable<Pais> {
    private String nombre;
    private int analfabetos;

    public Pais(String nombre, int analfabetos) {
        this.nombre = nombre;
        this.analfabetos = analfabetos;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getAnalfabetos() {
        return this.analfabetos;
    }

    @Override
    public String toString() {
        return this.getNombre() + " (" + this.getAnalfabetos() + ")";
    }

    @Override
    public int compareTo(Pais other) {
        if (this.analfabetos == other.getAnalfabetos()) {
            return 0;
        } else if (other.analfabetos > this                                                                                  .getAnalfabetos()) {
            return 1;
        } else {
            return -1;
        }
    }
}
