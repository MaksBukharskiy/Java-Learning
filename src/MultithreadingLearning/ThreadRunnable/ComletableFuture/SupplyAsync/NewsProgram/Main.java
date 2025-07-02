package MultithreadingLearning.ThreadRunnable.ComletableFuture.SupplyAsync.NewsProgram;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        ExecutorService controlExecutor = Executors.newSingleThreadExecutor();

        try {

            Message messageService = new Message();
            MessageProcessor processor = new MessageProcessor(messageService);
            DoneMessage doneMessage = new DoneMessage();

            CompletableFuture<Void> workflow = CompletableFuture
                    .runAsync(() -> System.out.println("Start"), controlExecutor)
                    .thenCompose(__ -> processor.processMessages())
                    .thenRunAsync(() -> System.out.println("Messages is ended"), controlExecutor);

            CompletableFuture<Object> done = CompletableFuture.anyOf(
                    doneMessage.getEndMessage1(),
                    doneMessage.getEndMessage2()
            );

            CompletableFuture.allOf(workflow, done)
                    .thenAccept(__ -> System.out.println("All done"));
        }

        finally {
            controlExecutor.shutdown();
            Message.shutdown();
            DoneMessage.shutdown();
        }

    }
}
