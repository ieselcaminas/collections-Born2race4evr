import java.util.HashMap;
import java.util.Map;

public class sorteo {

    public static Map<Character, Integer> terminacion(String[] boletos) {
        Map<Character, Integer> terminacion = new HashMap<>();
        Character ultimo;
        Integer contador;

        for (String boleto : boletos) {
            ultimo = boleto.charAt(boleto.length() - 1);
            contador = terminacion.get(ultimo);
            if (contador == null) {
                terminacion.put(ultimo, 1);
            }else {
                terminacion.put(ultimo, contador + 1);
            }
        }
        return terminacion;
    }


    public static void main(String[] args) {

        System.out.println(terminacion(new String[]{"03033", "01011", "02022"}));
    }
}
