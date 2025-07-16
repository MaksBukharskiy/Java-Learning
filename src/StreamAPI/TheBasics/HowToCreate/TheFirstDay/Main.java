package StreamAPI.TheBasics.HowToCreate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> list = List.of("Apple", "Banana", "Cherry", "Grape");
        List<Integer> integerList = List.of(1, 9, 3, 5, 7);

        List<String> forEachIteration = List.of("hell");

        List<String> filteredList = list.stream()
                .filter(s -> s.length() > 5).map(String::toLowerCase)
                .toList();

        List<Integer> filteredInteger = integerList.stream()
                        .filter(num -> num > 5).map(nums -> nums * nums)
                                .toList();

        forEachIteration.stream()
                .map(foreach -> foreach + 'o')
                .forEach(System.out::println);

        System.out.println(filteredList);
        System.out.println(filteredInteger);


    }
}
