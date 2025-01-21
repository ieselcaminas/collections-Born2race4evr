import java.util.HashMap;
import java.util.Map;

public class PaisCap2 {
    public static void main(String[] args) {
        Map<String, String> paises = new HashMap<>();
        paises.put("Francia", "Paris");
        paises.put("España", "Madrid");

        String capital = getCapital(paises, "España");
        if (capital != null) {
            System.out.println(capital);
        }else {
            System.out.println("No hay coincidencias");
        }
    }

    public static String getCapital(Map<String, String> paises, String pais) {
        return paises.get(pais); 
    }

}
