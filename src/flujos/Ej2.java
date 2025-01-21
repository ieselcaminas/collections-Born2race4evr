package flujos;

import java.util.ArrayList;
import java.util.List;

public class Ej2 {
    public static void main(String[] args) {
        List<Person> lista = new ArrayList<>();
        Person persona = new Person("pepe", "fernandez", 1968);
        lista.add(persona);
        persona = new Person("jacinto", "Andres", 1990);
        lista.add(persona);

        long count = lista.stream()
                .filter(p -> p.getLastName().startsWith("A"))
                .count();
        System.out.println(count);
    }
}
