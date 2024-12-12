import java.util.HashMap;
import java.util.Map;

public class botin {

    public static Map<Integer, String> repartir(int participantes, String[] billetes){
        Map<Integer, String> reparto = new HashMap<>();
        int leTocaA;
        String billete;
        String botin;

        for (int i = 0; i < billetes.length; i++) {
            billete = billetes[i];
            //para que sea un reparto circular que vuelva a 0 una vez alcanzado el num de participantes
            leTocaA = i % participantes;
            botin = reparto.get(leTocaA);

            if (botin == null){
                reparto.put(leTocaA, billete);
            }else {
                reparto.put(leTocaA, botin + " " + billete);
            }

        }
        return reparto;
    }

    public static void main(String[] args) {

        Map<Integer, String> reparto = repartir(2, new String[]{"10", "20", "30"});
        System.out.println(reparto);

    }


}
