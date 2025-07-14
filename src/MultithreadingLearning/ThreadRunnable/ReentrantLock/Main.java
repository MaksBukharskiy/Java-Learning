package MultithreadingLearning.ThreadRunnable.ReentrantLock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        ValueService value = new ValueService();
        ExecutorService executor = Executors.newFixedThreadPool(3);
        ExecutorService executor2 = Executors.newSingleThreadExecutor();


        for (int i = 0; i < 5; i++) {
            executor.execute(() -> {
                for (int j = 0; j < 2; j++) {
                    value.increment();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            });

        }

        executor2.execute(() -> {
                System.out.println("Hi");
        });

        executor.shutdown();
        executor2.shutdown();

    }
}
