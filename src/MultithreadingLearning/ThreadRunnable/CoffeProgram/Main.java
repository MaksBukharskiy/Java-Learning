package MultithreadingLearning.ThreadRunnable.CoffeProgram;

import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {

        CoffeFinder finder = new CoffeFinder();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coffe");
        String input = sc.nextLine();

        CompletableFuture<String> future = finder.findCoffeeName(input);

        future.thenAccept(System.out::println);
        sc.close();

        future.join();

    }
}
