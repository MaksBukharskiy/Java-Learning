package MultithreadingLearning.ThreadRunnable.ComletableFuture.SupplyAsync.ThenCombine;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        CompletableFuture <String> string1 = CompletableFuture.supplyAsync(() -> "Helo");
        CompletableFuture <String> string2 = CompletableFuture.supplyAsync(() -> ", my name is Maks");

        Future <Void> result = string1.thenCombine(string2, (a, b) -> a + b)
                .thenAccept(System.out::println);
    }
}
