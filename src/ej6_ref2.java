public class ej6_ref2 {
    public static void main(String[] args) {
        System.out.println(esHyperpar(40));
        System.out.println(esHyperpar(24));
        System.out.println(esHyperpar(120));
    }


    public static boolean esHyperpar(int num){
        int digito;
        while (num > 0){
            digito = num % 10;
            if (digito % 2 != 0){
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
