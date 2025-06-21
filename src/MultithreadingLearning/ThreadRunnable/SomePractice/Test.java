package MultithreadingLearning.ThreadRunnable.SomePractice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future <Integer> futureInteger = executor.submit(() -> {
            return 52;
        });

        Integer result = futureInteger.get();
        System.out.println(result);
    }
}
