package MultithreadingLearning.ThreadRunnable.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for(int i = 0; i < 10; i++){
            int counter = i;

            executor.execute(() -> {
                System.out.println("Thread " + Thread.currentThread().getName());

                try{
                    Thread.sleep(2000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            });
        }
    }
}
