package StreamAPI.TheBasics.HowToCreate.TheSecondDay;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = List.of("Maks", "Joihn", "Ari", "BE");

        List<String> results = names
                .stream().sorted(Comparator.comparing(String::length)).toList();

        List<String> results2 = names
                .stream().sorted(Comparator.reverseOrder()).toList();

        System.out.println(results);
        System.out.println(results2);

    }
}
