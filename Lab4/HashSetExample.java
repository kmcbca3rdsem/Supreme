package Lab4;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<Integer>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);

        System.out.println(numbers);
    }
}