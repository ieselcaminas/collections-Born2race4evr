package comparable;

import flujos.Person;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Ej1 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,4,1,7};

        Arrays.sort(nums);
        Arrays.stream(nums).forEach(System.out::println);

        List<Person> persons = new ArrayList<>();

        Person p = new Person("Pepe", "Manuel", 1976);
        persons.add(p);
        p = new Person("Jose", "Francisco", 1980);
        persons.add(p);
        persons.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
