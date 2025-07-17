package StreamAPI.TheBasics.HowToCreate.TheThirdDay.anyMatchMethod.GoingMoreDeeper;

import org.w3c.dom.ls.LSOutput;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<User> users = List.of(
                new User("Maks", 161.0),
                new User("Maks", 165.0),
                new User("Artem", 150.1),
                new User("Artem", 150.1)
        );

        List<Integer> reduceLearning = List.of(1, 2, 3, 4, 5, 6);

        boolean isExpensive = users.stream()
                .filter(userName -> userName.name().contains("M"))
                .anyMatch(userPrice -> userPrice.price() > 160);

        boolean isAllExpensive = users.stream()
                .allMatch(n -> n.price() > 150);

        boolean isNoneMatch = users.stream()
                .noneMatch(p -> p.name().contains("u"));

        int sumReduce = reduceLearning.stream()
                .sorted(Comparator.reverseOrder())
                .reduce(0, (a, b) -> a + b);

        Optional<Integer> max = reduceLearning.stream()
                .reduce(Integer::max);

        System.out.println("Sum of reduce is: " + sumReduce);
        System.out.println("The max integer is: " + max);

        if (isNoneMatch){
            List<User> maksRes = users.stream()
                    .filter(o -> o.name().length() > 4)
                    .distinct().toList();

            System.out.println(maksRes);
        }

        if(isExpensive && isAllExpensive){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

    }
}
