package StreamAPI.TheBasics.HowToCreate.TheFifthDay;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        List<Integer> skippedList = integerList
                .stream()
                .skip(1)
                .limit(3)
                .toList();

        System.out.println(skippedList);

    }
}
