package MultithreadingLearning.ThreadRunnable.CopyOnWriteArrayList;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws InterruptedException , ExecutionException {

        NameService service = new NameService();

        CompletableFuture <Void> addFuture = service.addName();
        CompletableFuture<CopyOnWriteArrayList<String>> arrayListFuture = service.getName();

        CompletableFuture.allOf(addFuture, arrayListFuture).join();

        CopyOnWriteArrayList<String> result = arrayListFuture.get();
        System.out.println("Your total names is: " + result);

    }
}
