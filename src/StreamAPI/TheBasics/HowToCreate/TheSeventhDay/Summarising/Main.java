package StreamAPI.TheBasics.HowToCreate.TheSeventhDay.Summarising;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
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

        String result = resultOfFinal.parallelStream()
                .filter(s -> s.startsWith("A"))
                .map(s -> s.toUpperCase())
                .sorted()
                .collect(Collectors.joining(", "));

        Map<Integer, List<String>> finalResult = resultOfFinal.parallelStream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .map(s -> " " + s + " ")
                .skip(1)
                .limit(2)
                .collect(Collectors.groupingBy(String::length));


        System.out.println(sumOfIntStream);
        System.out.println(result);

        System.out.println(finalResult);

    }
}
