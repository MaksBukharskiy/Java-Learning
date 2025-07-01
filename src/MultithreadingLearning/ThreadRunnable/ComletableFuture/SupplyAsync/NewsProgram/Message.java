package MultithreadingLearning.ThreadRunnable.ComletableFuture.SupplyAsync.NewsProgram;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Message {

    private static final ExecutorService executor = Executors.newFixedThreadPool(2);

    public CompletableFuture<String> getMessage1(String message) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName() +  " - " + message);
            return "Message 1";
        }, executor);
    }

    public CompletableFuture <String> getMessage2(String message) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName() +  " - " + message);
            return "Message 2";
        }, executor);
    }

}
