package MultithreadingLearning.ThreadRunnable.RunnableCallableFuture.Callable;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable <String> task = () ->{
            System.out.println(Thread.currentThread().getName());
            return "Hello World";
        };

        ExecutorService executor = Executors.newFixedThreadPool(5);
        Future<String> future = executor.submit(task);

        String result = future.get();
        System.out.println(result);

        executor.shutdown();

    }
}
