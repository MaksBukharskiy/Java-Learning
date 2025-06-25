package MultithreadingLearning.ThreadRunnable.ComletableFuture.SupplyAsync.NewCalculatorAsync;

import java.util.concurrent.CompletableFuture;

public class LoggerService {

    public CompletableFuture<Void> logCompletion(){
        return CompletableFuture.runAsync(() -> {
            System.out.println("Log is completed");
        });
    }

}
