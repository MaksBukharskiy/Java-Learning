package TreeMapLearning;

import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        Map <Integer, String> treeMap = new TreeMap<>();

        treeMap.put(77, "Moskov");
        treeMap.put(196, "Ekaterinburg");
        treeMap.put(05, "Dagesan");
        treeMap.put(25, "Something");

        treeMap.remove(05);

        System.out.println(treeMap);
        System.out.println(treeMap.get(77));
        System.out.println(treeMap.containsKey(77));
        System.out.println(treeMap.containsValue(34));
    }
}
