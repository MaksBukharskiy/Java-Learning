package StreamAPI.TheBasics.HowToCreate.TheThirdDay.anyMatchMethod.GoingMoreDeeper;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = List.of(
                new User("Maks", 161.0),
                new User("Maks", 165.0),
                new User("Artem", 150.0)
        );

        boolean isExpensive = users.stream()
                .filter(userName -> userName.name().contains("M"))
                .anyMatch(userPrice -> userPrice.price() > 160);

        if(isExpensive){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

    }
}
