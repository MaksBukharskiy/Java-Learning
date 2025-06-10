package MultithreadingLearning.ThreadRunnable.Volatile;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread timer = new MyThread();
        timer.start();

        int sleep = 10000;
        Thread.sleep(sleep);

        timer.stop();
        System.out.println("Main thread stopped");


    }
}
