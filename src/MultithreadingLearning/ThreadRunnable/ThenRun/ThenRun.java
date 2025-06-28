package MultithreadingLearning.ThreadRunnable.ThenRun;

import java.util.concurrent.CompletableFuture;

public class ThenRun {
    public static void thenRun(){
        CompletableFuture<Void> future = CompletableFuture
                .supplyAsync(() -> {
                    System.out.println("Выполняется задача, возвращающая результат.");
                    return "Результат";
                })
                .thenRun(() -> {
                    System.out.println("Выполняется действие после завершения задачи (thenRun).");
                });

        // Ожидание завершения
        future.join();
    }
}
