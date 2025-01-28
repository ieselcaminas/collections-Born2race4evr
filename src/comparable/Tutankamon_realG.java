package comparable;

import java.util.ArrayList;
import java.util.List;

public class Tutankamon_realG {
    public static void main(String[] args) {
        List<Inventario_tutankamon> inventarioTutankamons = new ArrayList<>();
        Inventario_tutankamon it = new Inventario_tutankamon("monedas",25, 4, 1);
        inventarioTutankamons.add(it);

        it = new Inventario_tutankamon("cadena",50, 20, 2);
        inventarioTutankamons.add(it);

        it = new Inventario_tutankamon("escudo",100, 50, 3);
        inventarioTutankamons.add(it);

        it = new Inventario_tutankamon("anillo",200, 6, 4);
        inventarioTutankamons.add(it);

        inventarioTutankamons.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
