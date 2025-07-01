package MultithreadingLearning.ThreadRunnable.ComletableFuture.SupplyAsync.NewsProgram;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        Message finalMessage = new Message();
        NewsService serviceMessages = new NewsService();

        CompletableFuture<String> message1 = finalMessage.getMessage1("for message 1");
        CompletableFuture<String> message2 = finalMessage.getMessage2("for message 2");

        CompletableFuture<Void> waitingForAllMessages = CompletableFuture.allOf(message1, message2);

        CompletableFuture <String> combineMessages = finalMessage.combineMessages("message1", "message2");
        CompletableFuture <Integer> getLength = finalMessage.getMessageLength("leng");

        serviceMessages.thenRunAfter().thenRun(() -> System.out.println("Done"));

    }
}
