import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PaisCapital {

    public static String paisCapital(String pais) {
        String capital = "";
        HashMap<String, String> mapa1= new HashMap<>();
        mapa1.put("Francia", "Paris");
        mapa1.put("Italia", "Roma");
        mapa1.put("Alemania", "Berlín");
        capital = mapa1.get(pais);
        return capital;
    }




    public static void main(String[] args) {

        String pais;
        Scanner sc = new Scanner(System.in);
        pais = sc.nextLine();

        String capital = paisCapital(pais);

        if (!capital.isEmpty()) {
            System.out.println(capital);
        }else{
            System.out.println("no existe el país: " + pais);
        }
    }
}
