package MultithreadingLearning.ThreadRunnable.CopyOnWriteArrayList;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CopyOnWriteArrayList;

public class NameService {

    private final CopyOnWriteArrayList<String> names = new CopyOnWriteArrayList<>();

    public CompletableFuture<Void> addName(){
            return CompletableFuture.supplyAsync(() -> {
                names.add("Maks");
                names.add("Tom");
                System.out.println("Names added: " + names);
                return null;
            });
    }

    public CompletableFuture<CopyOnWriteArrayList<String>> getName(){
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Current names: " + names);
            return names;
        });
    }
}
