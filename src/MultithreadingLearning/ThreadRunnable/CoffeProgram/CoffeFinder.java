package MultithreadingLearning.ThreadRunnable.CoffeProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.locks.ReentrantLock;

public class CoffeFinder {

    private final Map<String, String> coffeeList = new HashMap<>();
    private final ReentrantLock lock = new ReentrantLock();

    public CoffeFinder() {
        lock.lock();

        try {
            coffeeList.put("cappuccino", "Recipe");
            coffeeList.put("latte", "Recipe");
        } finally {
            lock.unlock();
        }
    }

    public CompletableFuture<String> findCoffeeName(String coffeeName) {
        return CompletableFuture.supplyAsync(() -> {
            lock.lock();

            try {
                String recipe = coffeeList.get(coffeeName.toLowerCase());
                return recipe != null
                        ? "Рецепт " + coffeeName + ": " + recipe
                        : "Кофе '" + coffeeName + "' не найден";
            } finally {
                lock.unlock();
            }

        });
    }
}

