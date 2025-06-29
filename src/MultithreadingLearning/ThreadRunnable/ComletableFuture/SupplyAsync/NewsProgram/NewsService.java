package MultithreadingLearning.ThreadRunnable.ComletableFuture.SupplyAsync.NewsProgram;

import java.util.concurrent.CompletableFuture;

public class NewsService {

    public CompletableFuture<Void> thenRunAfter (){
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Inside thenRunAfter");
            return null;
        }).thenRun(() -> System.out.println("The program is ended"));
    }

}
