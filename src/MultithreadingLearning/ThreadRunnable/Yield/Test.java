package MultithreadingLearning.ThreadRunnable.Yield;

public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 5; i++){
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.yield();
            }
        }, "Thread1");

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 5; i++){
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.yield();
            }
        }, "Thread2");

        t2.start();

        t1.start();
        t1.setPriority(Thread.MAX_PRIORITY);
    }
}