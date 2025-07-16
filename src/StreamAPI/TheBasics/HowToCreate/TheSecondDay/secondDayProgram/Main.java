package StreamAPI.TheBasics.HowToCreate.TheSecondDay.secondDayProgram;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        EditingTheList theList = new EditingTheList();
        List<String> list = new ArrayList<>();

        list.add("Maks");
        list.add("Mak");
        list.add("M");
        list.add("Maks");
        list.add("Ma");

        List<String> resultNumberOne = theList.filterByTheDuplicates(list);
        List<String> resultNumberTwo =theList.reverseListAndAdd(list);
        List<String> resultNumberThree =theList.filterByTheLength(list, 3);

        System.out.println(resultNumberOne);
        System.out.println(resultNumberTwo);
        System.out.println(resultNumberThree);

    }
}
