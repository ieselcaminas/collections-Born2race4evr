import java.util.Stack;

public class parentesis {

    public static boolean esBalanceado(String cadena){
        boolean balanced;
        char caracter;
        char ultimo;
        Stack<Character> pila = new Stack<>();
        for (int i = 0; i < cadena.length(); i++) {

            //Si son de apertura, lo pongo en la pila

            caracter = cadena.charAt(i);

            if (caracter == '(' || caracter == '{' || caracter == '[') {
                pila.push(caracter);
            } else if (caracter == ')') {
                if (pila.isEmpty()) {
                    return false;
                }
                ultimo = pila.pop();
                if (ultimo != '(') {
                    return false;
                }

                //por hacer
                else if (ultimo != '{'){
                    if (pila.isEmpty()) {
                        return false;
                    }
                    return false;
                }else if (ultimo != '[') {
                    if (pila.isEmpty()) {
                        return false;
                    }
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(esBalanceado("{([()])}"));
    }
}
