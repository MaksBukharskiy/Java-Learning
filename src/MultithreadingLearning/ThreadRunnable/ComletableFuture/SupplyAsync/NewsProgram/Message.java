package MultithreadingLearning.ThreadRunnable.ComletableFuture.SupplyAsync.NewsProgram;

import java.util.concurrent.CompletableFuture;

public class Message {

    public CompletableFuture<String> getMessage1(String message1) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println(message1 + " is going");
            return "Message 1";
        });
    }

    public CompletableFuture <String> getMessage2(String message2) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println(message2 + " is going");
            return "Message 2";
        });
    }

    public CompletableFuture <String> combineMessages(String message1, String message2){
        return getMessage1(message1).thenCombine(getMessage2(message2), (mes1, mes2) -> {
            String overall = mes1 + " : " + mes2;
            return overall;
        });
    }

    public CompletableFuture<Integer> getMessageLength(String inputMessage){
        return getMessage1(inputMessage).thenCompose(message ->
                CompletableFuture.supplyAsync(() -> {
                    System.out.println("message 1 is: " + message);
                    return message.length();
                })
        );
    }


}
