import java.util.HashMap;
import java.util.Map;

public class ej3_ref2 {

    public static String sumaDigitos(String nums) {
        String res = "";
        int digito;

        int suma = 0;
        for (int i = 0; i < nums.length(); i++) {
            digito = Integer.parseInt("" + nums.charAt(i));
            suma += digito;
            if (i < nums.length() - 1) {
                res += digito + " + ";
            }else {
                res += digito + " = " + suma;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String digitos = ("3433");

        String res = sumaDigitos(digitos);
        System.out.println(res);

    }
}
