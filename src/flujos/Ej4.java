package flujos;

import java.util.List;
import java.util.ArrayList;


public class Ej4 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(-1);
        nums.add(1);
        nums.add(6);
        nums.add(3);
        nums.add(8);
        nums.stream()
                .filter(n -> n >=1 && n <= 5)
                .forEach(System.out::println);
    }
}
