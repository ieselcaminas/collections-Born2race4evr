import java.util.Arrays;

public class ej5_ref2 {

    public static double mediana(int[] numeros){
        double mediana;
        Arrays.sort(numeros);
        if (numeros.length % 2 == 0){
            double valor1 = numeros[numeros.length/2];
            double valor2 = numeros[numeros.length/2-1];
            mediana = (valor1 + valor2) / 2;
        }else {
            mediana = numeros[numeros.length - 1];
        }
        return mediana;
    }

    public static void main(String[] args) {
        int[] numeros = {1,2,5,4,3};
        System.out.println(mediana(numeros));

    }

}
