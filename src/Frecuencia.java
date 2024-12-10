import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frecuencia {

    public static Map<String, Integer> frecuency(String[] palabras) {
        Map<String, Integer> frequency = new HashMap<>();
        Integer contador;

        for (String palabra : palabras) {
            contador = frequency.get(palabra);
            if (contador == null) {
                frequency.put(palabra, 1);
            }else {
                frequency.put(palabra, contador + 1);
            }
        }
        return frequency;
    }


    public static void main(String[] args) {

        System.out.println(frecuency(new String[]{"uno", "dos", "tres"}));
    }
}
