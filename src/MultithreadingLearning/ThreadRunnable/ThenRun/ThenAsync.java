package MultithreadingLearning.ThreadRunnable.ThenRun;

import java.util.concurrent.CompletableFuture;

public class ThenAsync {
    public static void runAsync() {
        CompletableFuture<Void> future =  CompletableFuture.runAsync(() -> {
            System.out.println("Выполняется асинхронная задача (runAsync).");
            try {
                Thread.sleep(2000); // Имитация длительной задачи
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        future.join();
    }
}
