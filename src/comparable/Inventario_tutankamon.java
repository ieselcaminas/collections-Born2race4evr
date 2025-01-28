package comparable;

public class Inventario_tutankamon implements Comparable<Inventario_tutankamon> {
    private String nombre;
    private int value;
    private int peso;
    private int orden;

    public Inventario_tutankamon(String nombre, int value, int peso, int orden) {
    this.nombre = nombre;
    this.value = value;
    this.peso = peso;
    this.orden = orden;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    @Override
    public String toString() {
        return this.orden + " - " + this.nombre + " - " + this.value + " - " + this.peso;
    }
    @Override
    public int compareTo(Inventario_tutankamon other){
        //return other.orden - this.orden;
        if (this.value != other.value){
            //De mayor a menor
            return other.value - this.value;
        }else{
            //De menor a mayor
            return this.peso - orden;
        }else {
            return

            }
    }
}
