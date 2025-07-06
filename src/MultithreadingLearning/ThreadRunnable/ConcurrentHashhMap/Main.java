package MultithreadingLearning.ThreadRunnable.ConcurrentHashhMap;

import java.util.concurrent.ConcurrentHashMap;

public class Main {

    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> scores = new ConcurrentHashMap<>();

        scores.put("Alice", 10);
        scores.put("Bob", 20);

        scores.compute("Alice", (k, v) -> v + 5);
        scores.compute("Bob", (key, value) -> value + 4);

        scores.forEach((name, score) ->
                System.out.println(name + ": " + score)
        );

        scores.remove("Bob");
    }

}
