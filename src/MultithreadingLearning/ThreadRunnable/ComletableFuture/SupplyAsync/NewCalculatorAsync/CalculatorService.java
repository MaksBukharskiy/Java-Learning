package MultithreadingLearning.ThreadRunnable.ComletableFuture.SupplyAsync.NewCalculatorAsync;

import java.util.concurrent.CompletableFuture;

public class CalculatorService {

    public CompletableFuture<Integer> getNumber1(){
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Your number is got");
            return 10;
        });
    }

    public CompletableFuture <Integer> getNumber2(){
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Your number is got");
            return 20;
        });
    }

    public CompletableFuture<Integer> addNumbers(int number1, int number2){
        return CompletableFuture.supplyAsync(() -> number1 + number2);
    }

    public CompletableFuture<Integer> multiplyBy(CompletableFuture<Integer> future, int multiplier) {
        return future.thenApply(result -> result * multiplier);
    }

}
