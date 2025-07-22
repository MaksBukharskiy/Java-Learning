package StreamAPI.TheBasics.HowToCreate.TheSeventhDay.Summarising;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> summingInteger = new ArrayList<>();

        summingInteger.add(2);
        summingInteger.add(6);
        summingInteger.add(2);
        summingInteger.add(3);
        summingInteger.add(3);

        List<String> resultOfFinal = List.of("Ann", "Bob", "Alice", "Anna");

        int sumOfIntStream = summingInteger.stream()
                .limit(4)
                .distinct()
                .collect(Collectors.summingInt(Integer::intValue));

        String result = resultOfFinal.stream()
                .filter(s -> s.startsWith("A"))
                .map(s -> s.toUpperCase())
                .sorted()
                .collect(Collectors.joining(", "));


        System.out.println(sumOfIntStream);
        System.out.println(result);

    }
}
