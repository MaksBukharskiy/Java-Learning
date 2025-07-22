package StreamAPI.TheBasics.HowToCreate.TheSeventhDay.AgeGrouping.GoingMoreDeeper;


import StreamAPI.TheBasics.HowToCreate.TheFourthDay.FlatMapLearning.GoingMoreDeeper.Person;
import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<People> peopleInfo = List.of(
                new People("Maks", 16),
                new People("Anya", 16),
                new People("Artem", 14),
                new People("Adyolla", 14)
        );

        Map<Integer, List<People>> groupedByAge = peopleInfo.stream()
                .collect(Collectors.groupingBy(s -> s.age()));

        Map<Boolean, List<People>> pertioningBy = peopleInfo.stream()
                .collect(Collectors.partitioningBy(name -> name.name().equals("Maks")));

        List<String> mappedList = peopleInfo.stream()
                .map(s -> s.name().toLowerCase())
                        .toList();

        String joinedMapOfPeople = mappedList.stream()
                        .collect(Collectors.joining(", "));


        System.out.println(groupedByAge);
        System.out.println(pertioningBy);
        System.out.println(joinedMapOfPeople);

    }
}
