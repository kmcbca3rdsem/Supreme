package Lab4;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "Rahul");
        map.put(2, "Amit");
        map.put(3, "Neha");

        System.out.println(map);
    }
}