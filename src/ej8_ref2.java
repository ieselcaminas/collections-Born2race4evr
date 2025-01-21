import java.util.Arrays;

public class ej8_ref2 {


    public static int cualFalta(int[] numeros){
        int num_restante = 0;
        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i + 1] - numeros[i] > 1) {
                return numeros[i] + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] numeros = {4,3,6,2};
        System.out.println(cualFalta(numeros));
    }
}
