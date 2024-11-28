import java.util.ArrayList;
import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {
        System.out.println("introduce el numero de alumnos");
        int alumnos = numAlumnos();
        double media = 0;
        double mas_alto;
        double mas_bajo;
        ArrayList <Double> alturas = new ArrayList<>();
        System.out.println("introduce las alturas");
        alturas = leerAltura(alturas, alumnos);

        media = calcularMedia(alturas);
        System.out.println("La media de los alumnos es: " + media);

        mas_alto = calcularAlturaSuperior(alturas);
        System.out.println("El mas alto mide: " + mas_alto);

        mas_bajo = calcularAlturaInferior(alturas);
        System.out.println("El mas bajo mide: " + mas_bajo);

    }
    public static int numAlumnos() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static ArrayList<Double> leerAltura(ArrayList<Double> altura, int numAlumnos) {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numAlumnos; i++) {
            altura.add(sc.nextDouble());

        }
        return altura;
    }
    public static double calcularMedia(ArrayList<Double> alturas){
        double media;
        double suma = 0;
        for (int i = 0; i < alturas.size(); i++) {
             suma += alturas.get(i);
        }
        media = suma / alturas.size();
        return media;
    }
    public static double calcularAlturaSuperior(ArrayList<Double> alturas){
        int contador = 0;
        for (int i = 0; i < alturas.size(); i++) {
            if (alturas.get(i) > alturas.get(contador)) {
                contador = i;
            }
        }
        return alturas.get(contador);
    }
    public static double calcularAlturaInferior(ArrayList<Double> alturas){
        int contador = 0;
        for (int i = 0; i < alturas.size(); i++) {
            if (alturas.get(i) < alturas.get(contador)) {
                contador = i;
            }
        }
        return alturas.get(contador);
    }
}
