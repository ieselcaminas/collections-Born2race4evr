package flujos;

import java.util.ArrayList;
import java.util.List;

public class Ej1 {
    public static void main(String[] args) {
        List<Person> lista = new ArrayList<>();
        Person persona = new Person("Pepe", "Manuel", 1960);
        lista.add(persona);
        persona = new Person("Aurelia", "Fernandez", 1980);
        lista.add(persona);

        long count = lista.stream()
                .filter(person -> person.getBirthYear() < 1970)
                .count();
        System.out.println(count);

    }
}
