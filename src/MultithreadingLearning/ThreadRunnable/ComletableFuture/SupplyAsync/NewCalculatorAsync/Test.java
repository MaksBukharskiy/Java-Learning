package MultithreadingLearning.ThreadRunnable.ComletableFuture.SupplyAsync.NewCalculatorAsync;

import java.util.concurrent.CompletableFuture;

public class Test {
    public static void main(String[] args) {

        CalculatorService calculator = new CalculatorService();
        LoggerService logger = new LoggerService();

        CompletableFuture<Integer> future1 = calculator.getNumber1();
        CompletableFuture<Integer> future2 = calculator.getNumber2();

        CompletableFuture<Integer> sumFuture = future1.thenCombine(future2, (a, b) -> a + b);
        CompletableFuture<Integer> combineFuture = future1.thenCombine(future2, (a, b) -> a * b);

        sumFuture.thenAccept(sum -> System.out.println("Sum: " + sum));
        combineFuture.thenAccept(resultof -> System.out.println("Result: " + resultof));

        logger.logCompletion().thenRun(() -> System.out.println("Done"));
        
    }
}

