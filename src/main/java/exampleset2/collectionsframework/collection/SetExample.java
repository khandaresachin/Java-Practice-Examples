package batch2.collectionsframework.collection;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(12);
        numbers.add(15);
        numbers.add(20);
        numbers.add(5);
        numbers.add(28);

        numbers.add(12);
        numbers.add(20);
        numbers.add(37);

        System.out.println(numbers);

    }
}
