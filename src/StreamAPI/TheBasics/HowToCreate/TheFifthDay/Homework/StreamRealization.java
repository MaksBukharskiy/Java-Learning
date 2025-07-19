package StreamAPI.TheBasics.HowToCreate.TheFifthDay.Homework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.Locale.filter;
import static java.util.stream.Collectors.toList;

public class StreamRealization {

    public List<String> puttingIntoTheStream(List<PersonNames> list){
        return list.stream()
                .flatMap(person -> person.lastName().stream())
                .toList();
    }

    public List<String> filteredList(List<String> list){
        return list.stream()
                .map(s -> s.split("@")[1])
                .toList();
    };

    public List<String> upperCaseFilteredList(List<String> list){
        return list.stream()
                .map(String::toUpperCase)
                .filter(y -> y.contains("A"))
                .toList();
    }

    public List<String> duplicatesFilteredList(List<String> list){
        return list.stream()
                .distinct()
                .toList();
    }

    public List<String> finalSortedList(List<String> list){
        return list.stream()
                .sorted()
                .skip(3)
                .limit(1)
                .toList();
    }


}
