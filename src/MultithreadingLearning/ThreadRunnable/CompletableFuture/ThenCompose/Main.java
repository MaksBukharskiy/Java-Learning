package MultithreadingLearning.ThreadRunnable.CompletableFuture.ThenCompose;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args){
        CompletableFuture <String> future = CompletableFuture.supplyAsync(() -> "Java");
        CompletableFuture <Integer> futureInteger = CompletableFuture.supplyAsync(() -> 10);


        future.thenCompose((result) -> {
            return CompletableFuture.supplyAsync(() -> result + " 21");
        })
                .thenAccept((res) -> System.out.println("result: " + res));


        CompletableFuture <Integer> integerResult = futureInteger
                .thenCompose((number) -> CompletableFuture.supplyAsync(() -> number * 2))
                .thenCompose((number) -> CompletableFuture.supplyAsync(() -> number * 3));

        integerResult.thenAccept(res -> System.out.println("The final Integer result is: " + res));

        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
