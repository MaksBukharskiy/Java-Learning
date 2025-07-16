package StreamAPI.TheBasics.HowToCreate.TheThirdDay.anyMatchMethod.GoingMoreDeeper;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = List.of(
                new User("Maks", 161.0),
                new User("Maks", 165.0),
                new User("Artem", 150.1),
                new User("Artem", 150.1)
        );

        boolean isExpensive = users.stream()
                .filter(userName -> userName.name().contains("M"))
                .anyMatch(userPrice -> userPrice.price() > 160);

        boolean isAllExpensive = users.stream()
                .allMatch(n -> n.price() > 150);

        boolean isNoneMatch = users.stream()
                .noneMatch(p -> p.name().contains("u"));


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
