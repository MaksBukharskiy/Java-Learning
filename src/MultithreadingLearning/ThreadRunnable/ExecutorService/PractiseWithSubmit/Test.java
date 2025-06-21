package MultithreadingLearning.ThreadRunnable.ExecutorService.PractiseWithSubmit;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future <?> future = executor.submit(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
        });

        System.out.println(future.isDone());
        Thread.sleep(2000);
        System.out.println(future.isDone());

    }
}
