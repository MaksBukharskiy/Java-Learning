package MultithreadingLearning.ThreadRunnable.SynchronizedLearning;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread counter = new MyThread();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                counter.increment();
            }
        });

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        System.out.println("Итоговый счетчик: " + counter.getCounter());

    }
}
