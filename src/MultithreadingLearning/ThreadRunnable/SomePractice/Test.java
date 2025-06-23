package MultithreadingLearning.ThreadRunnable.SomePractice;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Callable <Integer> task = () -> {
            System.out.println("completing task");
            Thread.sleep(3000);
            return 42;
        };

        Future<Integer> future = executor.submit(task);

        try{
            System.out.println("Waiting result");
            future.get();
            System.out.println("Completed task " + future.get());
        }
        catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}
