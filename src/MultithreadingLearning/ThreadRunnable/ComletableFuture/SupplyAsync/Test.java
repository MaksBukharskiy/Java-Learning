package MultithreadingLearning.ThreadRunnable.ComletableFuture.SupplyAsync;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Test {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CompletableFuture <Integer> future = CompletableFuture.supplyAsync(() -> {
            String text = "Hello World";
            System.out.println(text);
            return text.length();
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            return "Hello World";
        });

        CompletableFuture <Integer> integerFuture = CompletableFuture.supplyAsync(() -> {
            Integer text = 12;
            return 1 + text;
        });

        future2.thenApply(l -> l + "!!!!!!").thenAccept(res2 -> System.out.println("From Maks: " + res2));
        integerFuture.thenApply(r -> r + 1000).thenAccept(res -> System.out.println("result: " + res));


        CompletableFuture <Void> futureLogger = CompletableFuture.runAsync(() -> {
            System.out.println("Logging is ended");
        });


        Integer length = future.get(); // 11
        Integer text1 = integerFuture.get(); // 13

        System.out.println("Length: " + length);
        System.out.println("result: " + text1);

        futureLogger.get();

        System.out.println("Future logged successfully");
        
    }
}
