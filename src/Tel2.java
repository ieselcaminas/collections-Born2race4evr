import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tel2 {

    public static ArrayList<String> guiaTelefonica(String numTel) {
        String numA = "";
        HashMap<String, ArrayList<String>> mapa1= new HashMap<>();

        ArrayList<String> telefonos = new ArrayList<>();
        telefonos.add("1111");
        telefonos.add("2222");
        mapa1.put("pepe", telefonos);

        telefonos = new ArrayList<>();
        telefonos.add("3333");
        telefonos.add("4444");

        mapa1.put("jacinto", telefonos);

        telefonos = new ArrayList<>();
        telefonos.add("5555");

        mapa1.put("remus", telefonos);

        return mapa1.get(numTel);
    }




    public static void main(String[] args) {

        String numTel;
        Scanner sc = new Scanner(System.in);
        numTel = sc.nextLine();

        ArrayList<String> numA = guiaTelefonica(numTel);

        if (!numA.isEmpty()) {
            System.out.println(numA);
        }else{
            System.out.println("no existe el numero: " + numTel);
        }
    }
}
