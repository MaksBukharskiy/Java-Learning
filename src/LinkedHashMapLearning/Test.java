package LinkedHashMapLearning;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map <String, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("Maks", 16);
        linkedHashMap.put("Maksss", 96);
        linkedHashMap.put("Makss", 17);

        linkedHashMap.remove("Maks");
        System.out.println(linkedHashMap.containsKey("Maks"));

        boolean containsKey = linkedHashMap.containsKey("Makss");
        System.out.println(containsKey);


        System.out.println(linkedHashMap);
    }
}
