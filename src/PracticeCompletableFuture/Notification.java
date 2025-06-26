package PracticeCompletableFuture;

import java.util.concurrent.CompletableFuture;

public class Notification {

    public CompletableFuture<Void> sendMessage(){
        return CompletableFuture.runAsync(() -> {
            System.out.println("Notification sent");
        });
    }
}
