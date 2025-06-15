package MultithreadingLearning.ThreadRunnable.SynchronyzedBlock;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread counter = new MyThread();

        Thread t1 = new Thread( () -> {
            for(int i = 0; i < 100; i++){
                counter.increment();
            }
        });

        Thread t2 = new Thread( () -> {
            for(int i = 0; i < 100; i++){
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
