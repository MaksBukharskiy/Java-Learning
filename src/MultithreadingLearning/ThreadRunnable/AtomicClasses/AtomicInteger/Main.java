package MultithreadingLearning.ThreadRunnable.AtomicClasses.AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    private static final AtomicInteger nextId = new AtomicInteger(1);

    public static int generateId() {
        return nextId.getAndIncrement();
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " : " + generateId());
            }).start();
        }
    }
}
