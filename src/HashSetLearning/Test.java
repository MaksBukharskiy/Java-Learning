package HashSetLearning;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set <String> hashSet = new HashSet<>();

        hashSet.add("Maks");
        hashSet.add("Arianna");
        hashSet.add("Ariann");

        hashSet.remove("Ariann");
        hashSet.remove("Maks");

        System.out.println(hashSet.contains("Maks"));
        System.out.println(hashSet.contains("Arianna"));
        System.out.println(hashSet);
    }
}
