package MultithreadingLearning.ThreadRunnable.ComletableFuture.SupplyAsync.NewsProgram;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        ExecutorService controlExecutor = Executors.newSingleThreadExecutor();

        Message messageService = new Message();
        MessageProcessor processor = new MessageProcessor(messageService);

        CompletableFuture<Void> workflow = CompletableFuture
                .runAsync(() -> System.out.println("Начало работы"), controlExecutor)
                .thenCompose(__ -> processor.processMessages())
                .thenRunAsync(() -> System.out.println("Завершение работы"), controlExecutor);

        workflow.join();
        controlExecutor.shutdown();

    }
}
