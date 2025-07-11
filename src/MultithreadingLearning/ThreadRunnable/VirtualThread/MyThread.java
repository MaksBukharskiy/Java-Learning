package MultithreadingLearning.ThreadRunnable.VirtualThread;

public class MyThread {
    public static void main(String[] args) throws InterruptedException {

        Thread v1 = Thread.ofVirtual().start(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });

        Thread v2 = Thread.startVirtualThread(() -> System.out.println("Hello World"));

        v1.join();
        v2.join();

    }
}
