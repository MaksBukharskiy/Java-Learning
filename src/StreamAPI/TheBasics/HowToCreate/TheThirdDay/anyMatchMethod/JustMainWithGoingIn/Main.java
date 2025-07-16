package StreamAPI.TheBasics.HowToCreate.TheThirdDay.anyMatchMethod.JustMainWithGoingIn;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = java.util.List.of("Maks", "Artem", "Bukharskiy");

        List<String> finalResultOfList = list.stream().sorted(Comparator.reverseOrder()).toList();
        boolean resultTrueOrFalse = finalResultOfList.stream().anyMatch(word -> word.length() > 4);

        while(resultTrueOrFalse){
            System.out.println(resultTrueOrFalse);
            System.out.println(finalResultOfList);

            resultTrueOrFalse = false;
        }


    }
}
