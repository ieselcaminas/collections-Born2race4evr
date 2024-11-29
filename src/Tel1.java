import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tel1 {

    public static String guiaTelefonica(String numTel) {
        String numA = "";
        HashMap<String, String> mapa1= new HashMap<>();
        mapa1.put("pepe", "1111");
        mapa1.put("jacinto", "2222");
        mapa1.put("remus", "3333");
        numA = mapa1.get(numTel);
        return numA;
    }




    public static void main(String[] args) {

        String numTel;
        Scanner sc = new Scanner(System.in);
        numTel = sc.nextLine();

        String numA = guiaTelefonica(numTel);

        if (!numA.isEmpty()) {
            System.out.println(numA);
        }else{
            System.out.println("no existe el numero: " + numTel);
        }
    }
}
