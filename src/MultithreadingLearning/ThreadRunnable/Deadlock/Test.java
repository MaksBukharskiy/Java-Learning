package MultithreadingLearning.ThreadRunnable.Deadlock;

public class Test {
    public static void main(String[] args) {
        ThreadOne threadOne = new ThreadOne();
        ThreadTwo threadTwo = new ThreadTwo();

        Thread thread1 = new Thread(() -> {
            threadOne.access(threadTwo);
        }, "ThreadOne");

        Thread thread2 = new Thread(() -> {
            threadTwo.access(threadOne);
        }, "ThreadTwo");

        thread1.start();
        thread2.start();
    }
}
