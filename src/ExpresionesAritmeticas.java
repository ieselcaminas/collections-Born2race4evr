import java.util.Stack;

public class ExpresionesAritmeticas {

    public static boolean esNum(String cadena) {
        return Character.isDigit(cadena.charAt(0));
    }

    public static int calculo(String expresion) {

        String terminos[] = expresion.split(" ");
        Integer num;
        Integer n1;
        Integer n2;
        Stack<Integer> pila = new Stack<>();

        for (int i = 0; i < terminos.length; i++) {

            if (esNum(terminos[i])){
                num = Integer.parseInt("" + terminos[i]);
                pila.push(num);
            } else {
                n2 = pila.pop();
                n1 = pila.pop();
                if (terminos[i].equals("+")) {
                    pila.push(n1 + n2);
                }
                else if (terminos[i].equals("-")) {
                    pila.push(n1 - n2);
                }
                else if (terminos[i].equals("/")) {
                    pila.push(n1 / n2);
                }
                else if (terminos[i].equals("*")) {
                    pila.push(n1 * n2);
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
