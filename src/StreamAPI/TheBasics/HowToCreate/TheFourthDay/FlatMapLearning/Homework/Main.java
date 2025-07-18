package StreamAPI.TheBasics.HowToCreate.TheFourthDay.FlatMapLearning.Homework;

import MultithreadingLearning.ThreadRunnable.Starvation.MyThread;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CompletableFuture<String> passwordFuture = CompletableFuture.supplyAsync(() -> {
            System.out.print("Enter the secret password: ");
            return sc.nextLine();
        });


        List<Cars> allCars = List.of(
                new Cars("Mercedes benz", List.of("Brabus@maks", "Brabus@maks")),
                new Cars("Toyota", List.of("Supra@something", "Brabus@artem")),
                new Cars("Genesis", List.of("GV80@marry", "Brabus@artem"))
        );

        List<String> getUniqueName = allCars.stream()
                .flatMap(car -> car.model().stream())
                .map(listCarModel -> listCarModel.split("@")[1])
                .distinct()
                .toList();

        passwordFuture.thenAccept(password -> {

            if ("hello1234".equals(password)) {
                System.out.println("Unique domains: " + getUniqueName);
            } else {
                System.out.println("Access denied.");
            }

        }).join();

    }
}
