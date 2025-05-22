package HashSetRandomStringProgram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        String text = "Ak Bk Ck Dk Ek Fk Gk";
        String [] words = text.split(" ");

        Set<String> total = new HashSet<>(Arrays.asList(words));
        Set<String> total2 = new LinkedHashSet<>(Arrays.asList(words));

        System.out.println(total);
        System.out.println(total2);
    }
}
