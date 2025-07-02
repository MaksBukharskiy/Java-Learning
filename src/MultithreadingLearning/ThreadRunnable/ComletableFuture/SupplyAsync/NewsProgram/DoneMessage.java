package MultithreadingLearning.ThreadRunnable.ComletableFuture.SupplyAsync.NewsProgram;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DoneMessage {

    private static final ExecutorService executor = Executors.newFixedThreadPool(2);

    public CompletableFuture<String> getEndMessage1() {
        try {
            Thread.sleep(1000);
            return CompletableFuture.supplyAsync(() -> {
                return "End1";
            });
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public CompletableFuture<String> getEndMessage2() {
        try {
            Thread.sleep(100);
            return CompletableFuture.supplyAsync(() -> {
                return "End2";
            });
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void shutdown() {
        executor.shutdown();
    }

}
