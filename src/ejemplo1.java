import java.util.ArrayList;
import java.util.Collections;


public class ejemplo1 {
    public static void main(String[] args) {
        ArrayList<String> coches = new ArrayList<>();
        coches.add("bugatti");
        coches.add("koeniggsegg");
        coches.add("GTR");
        coches.add("NSX");

        System.out.println(coches.get(coches.size()-1));

        for (int i = 0; i < coches.size(); i++) {
            System.out.println(coches.get(i));
        }
        coches.remove(0);
        
        System.out.println("-----");
        for (int i = 0; i < coches.size(); i++) {
            System.out.println(coches.get(i));
        }

        if (coches.isEmpty()) {
            System.out.println("No hay coches");
        }

        ArrayList<Integer> coches2 = new ArrayList<>();
        coches2.add(8);
        coches2.add(2);
        coches2.add(5);
        coches2.add(9);

        int suma = 0;
        for (int i = 0; i < coches2.size(); i++) {
            suma += coches2.get(i);
        }
        System.out.println(suma / coches2.size());

        Collections.sort(coches2);


    }
}
