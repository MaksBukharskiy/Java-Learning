package MultithreadingLearning.ThreadRunnable.VirtualThread.WithExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("The virtual thread");

        try(ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()){
            Thread.sleep(2000);
            System.out.println("is started");
            for(int i = 0; i < 10; i++){
                final int taskId = i;

                executor.execute(() -> {
                    System.out.println("Executing task " + taskId);
                });

                try {
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){
                    System.out.println("Interrupted");
                }

            }
            System.out.println("All tasks executed");
        }
    }
}
