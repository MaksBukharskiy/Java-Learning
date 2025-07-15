package StreamAPI.TheBasics.HowToCreate.secondDayProgram;

import java.util.Comparator;
import java.util.List;

public class EditingTheList {

    public List<String> filterByTheDuplicates(List<String> nameInput){
        return nameInput.stream()
                .distinct().toList();
    }

    public List<String> filterByTheLength(List<String> list, Integer length){
        return list.stream().filter(filterI -> filterI.length() >= length).toList();
    }

    public List<String> reverseListAndAdd(List<String> reverse){
        return reverse.stream().sorted(Comparator.reverseOrder()).map(res -> res + "d").toList();
    }

}
