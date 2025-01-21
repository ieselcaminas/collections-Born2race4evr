import java.util.HashMap;
import java.util.Map;


public class ej4_ref2 {

    public static int moda(int[] numeros){
        int moda = 0;
        int max = 0;

        HashMap<Integer, Integer> frecuencia = new HashMap<>();
        Integer veces;

        for (int i = 0; i < numeros.length; i++) {
            veces = frecuencia.get(numeros[i]);
            if (veces == null) {
                frecuencia.put(numeros[i], 1);
            } else {
                frecuencia.put(numeros[i], veces + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            if (entry.getValue() > max){
                moda = entry.getKey();
                max = entry.getValue();
            }
        }
        return moda;
    }

    public static void main(String[] args) {
        int[] numeros = {1,2,3,2,4,5};
        System.out.println(moda(numeros));

    }
}
