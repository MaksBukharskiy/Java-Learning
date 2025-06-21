package MultithreadingLearning.ThreadRunnable.ExecutorService.PracticeWithCallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<Integer> future = executor.submit(() -> {
            return 2000;
        });

        System.out.println(future.isDone());
        System.out.println("Result: " + future.get());
        System.out.println(future.isDone());

        executor.shutdown();
    }
}
