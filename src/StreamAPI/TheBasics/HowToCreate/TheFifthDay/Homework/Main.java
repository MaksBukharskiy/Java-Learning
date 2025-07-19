package StreamAPI.TheBasics.HowToCreate.TheFifthDay.Homework;

import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        ListService listService = new ListService();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Password: ");
        String userInput = sc.nextLine();

        CompletableFuture<Boolean> future = listService.processInfoClient(userInput);

        future.thenAccept(result -> {
            if (result) {
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }
        });

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
