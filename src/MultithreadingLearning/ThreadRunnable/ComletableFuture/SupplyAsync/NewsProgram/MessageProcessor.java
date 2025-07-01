package MultithreadingLearning.ThreadRunnable.ComletableFuture.SupplyAsync.NewsProgram;

import java.util.concurrent.CompletableFuture;

public class MessageProcessor {
    private final Message messageService;

    public MessageProcessor(Message messageService) {
        this.messageService = messageService;
    }

    public CompletableFuture<Void> processMessages (){
        return messageService.getMessage1("1 message")
                .thenCompose(msg1 -> {
            System.out.println("Processing " + msg1);
            return messageService.getMessage2("2 message");
        })
                .thenAccept(msg2 -> {
                    System.out.println("Processing " + msg2);
                });


}
