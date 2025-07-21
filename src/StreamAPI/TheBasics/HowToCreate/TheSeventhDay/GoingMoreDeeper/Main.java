package StreamAPI.TheBasics.HowToCreate.TheSeventhDay.GoingMoreDeeper;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

         Map <Integer, List<String>> groupedFruits = Stream.of("apple", "banana", "cherry", "date")
                 .collect(Collectors.groupingBy(fruit -> fruit.length()));

         Map<Boolean, List<String>> partioningByMethod = Stream.of("apple", "banana", "cherry", "date")
                         .collect(Collectors.partitioningBy(fruit -> fruit.contains("a")));

        System.out.println(groupedFruits);
        System.out.println(partioningByMethod);

    }
}
