package StreamAPI.TheBasics.HowToCreate.TheSeventhDay;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Set<String> list = Stream.of("akk", "bkkk", "ckkkk", "akk") //типо без дубликатов
                .filter(s -> s.length() > 2)
                .collect(Collectors.toSet());

        List<Integer> set = Stream.of(1, 2, 2, 3, 4, 4, 5)
                .filter(s -> s > 2)
                .collect(Collectors.toList());


        System.out.println(list);
        System.out.println(set);


    }
}
