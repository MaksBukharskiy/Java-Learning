package MultithreadingLearning.ThreadRunnable.ExecutorService.FinalPractice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        try{

            Future<Integer> futureResult = executor.submit(new Task());

            System.out.println("Waiting for result");
            Integer result = futureResult.get();

            System.out.println("Result " + result);

        }
        finally {
            executor.shutdown();
        }
    }
}
