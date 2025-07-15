package StreamAPI.TheBasics.HowToCreate.TheSecondDay;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = List.of("Maks", "Joihn", "Ari", "BE", "BE", "BE");

        List<String> results = names
                .stream().sorted(Comparator.comparing(String::length)).distinct().toList();

        List<String> results2 = names
                .stream().sorted(Comparator.reverseOrder()).distinct().toList();

        System.out.println(results);
        System.out.println(results2);

    }
}
