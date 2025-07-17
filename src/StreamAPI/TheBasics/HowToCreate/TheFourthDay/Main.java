package StreamAPI.TheBasics.HowToCreate.TheFourthDay;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<List<String>> data = List.of(
                List.of("a", "b"),
                List.of("c"),
                List.of("d", "e")
        );

        List<String> flat = data.stream()
                .flatMap(List::stream)
                .toList();

        System.out.println(flat);

    }
}
