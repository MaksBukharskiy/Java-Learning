package StreamAPI.TheBasics.HowToCreate.TheEightsDay.Homework;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Set<Integer> setOfIntegers = new LinkedHashSet<>();

        setOfIntegers.add(10);
        setOfIntegers.add(20);
        setOfIntegers.add(30);
        setOfIntegers.add(45);
        setOfIntegers.add(32);
        setOfIntegers.add(32);

        List<String> listOfNames = List.of("Ann", "Anya", "Maks", "Mark", "Arianna", "Mike");


        Set <Integer> sortedNumbers = setOfIntegers.parallelStream()  // mini summary, because of parallel streams, we have unordered list, but this feature opens to us the new way, gives to us new advantage - speed of the program which becomes much better, gives us better performance, also not in this situation, I added it to practice this topic, but this is used in more CPU capacious tasks)

                .distinct()
                .map(s -> s + 1)
                .limit(4)
                .collect(Collectors.toSet());


        int sortedSumOfNumbers = sortedNumbers.stream()
                .reduce(0, Integer::sum);


        String findingTheLongestName = listOfNames.stream()
                        .reduce("", (a, b) -> a.length() > b.length() ? a : b);


        System.out.println("The sorted numbers: " + sortedNumbers);
        System.out.println("The final sum is: " + sortedSumOfNumbers);
        System.out.println("The biggest name length is: " + findingTheLongestName);

    }
}
