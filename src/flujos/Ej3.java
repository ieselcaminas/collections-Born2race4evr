package flujos;

import java.util.List;
import java.util.ArrayList;


public class Ej3 {
    public static void main(String[] args) {
        List<Person> personas = new ArrayList<>();
        Person p = new Person("Julian", "Alvarez", 1950);
        personas.add(p);
        p = new Person("Pepe", "Juan", 1965);
        personas.add(p);
        personas.stream()
                .map(persona -> persona.getFirstName())
                .distinct()
                .sorted()
                .forEach(nombre -> System.out.println(nombre));
    }
}
