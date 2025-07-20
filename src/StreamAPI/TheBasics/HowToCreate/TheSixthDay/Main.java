package StreamAPI.TheBasics.HowToCreate.TheSixthDay;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> listFindElement = List.of( 2, 3, 5, 6, 7);

        Integer foundList = listFindElement.stream()
                .findFirst()
                .orElse(12);

        Integer foundAnyList = listFindElement.stream()
                .findAny()
                .orElse(12);

        System.out.println(foundList);
        System.out.println(foundAnyList);

    }
}
