package LinkedHashSetLearning;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set <String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Maks");
        linkedHashSet.add("Adnan");
        linkedHashSet.add("Adnan"); //дубликат не добавиться
        linkedHashSet.add("Arianna");
        linkedHashSet.add("Lola");  

        linkedHashSet.remove("Lola");

        System.out.println(linkedHashSet.contains("Lola"));
        System.out.println(linkedHashSet.contains("Maks"));
        System.out.println(linkedHashSet); //важен порядок
    }
}
