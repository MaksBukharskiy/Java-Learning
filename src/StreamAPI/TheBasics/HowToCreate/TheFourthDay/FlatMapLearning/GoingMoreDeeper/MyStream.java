package StreamAPI.TheBasics.HowToCreate.TheFourthDay.FlatMapLearning.GoingMoreDeeper;

import java.util.List;

public class MyStream {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Maks", List.of("hello@gmail.com", "howareyou@gmail.com")),
                new Person("Artem", List.of("artem@gmail.com")),
                new Person("Alice", List.of("alice@gmail.com")),
                new Person("Alice", List.of("alice@gmail.com"))
        );

        List<String> checkingForDuplicates = people.stream()
                .flatMap(everyPerson -> everyPerson.email().stream())
                .distinct()
                .limit(4).toList();

        System.out.println(checkingForDuplicates);

    }
}
