package HashMapLearning;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map <String, Integer> hashMap = new HashMap<>();

        hashMap.put("Something", 00);
        hashMap.put("Maks", 32);

        hashMap.remove("Maks");
        hashMap.remove("Something");

        hashMap.put("Maks", 32);
        hashMap.put("Mark", 32);

        boolean containsKey = hashMap.containsKey("Apple");
        System.out.println(containsKey);

        boolean containsValue = hashMap.containsValue(32);
        System.out.println(containsValue);

        System.out.println(hashMap.size());
        System.out.println(hashMap);

        hashMap.clear();
        System.out.println(hashMap.size());

        System.out.println(hashMap);

    }
}