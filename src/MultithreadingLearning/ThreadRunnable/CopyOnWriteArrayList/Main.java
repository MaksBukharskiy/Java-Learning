package MultithreadingLearning.ThreadRunnable.CopyOnWriteArrayList;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {

        NameService service = new NameService();

        CompletableFuture <Void> addFuture = service.addName();
        CompletableFuture<CopyOnWriteArrayList<String>> arrayListFuture = service.getName();

        CompletableFuture.allOf(addFuture, arrayListFuture).join();

        System.out.println("Your total names is: " + service.getName());

    }
}
