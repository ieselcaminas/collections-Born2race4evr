package comparable;

import java.util.ArrayList;
import java.util.List;

public class Felipe {
    public static void main(String[] args) {
        List<Tareas> tareas = new ArrayList<>();
        Tareas t = new Tareas(1,10);
        tareas.add(t);

        t = new Tareas(1,50);
        tareas.add(t);

        t = new Tareas(4,20);
        tareas.add(t);

        t = new Tareas(2,5);
        tareas.add(t);

        tareas.stream()
                .sorted()
                .forEach(System.out::println);
    }

}
