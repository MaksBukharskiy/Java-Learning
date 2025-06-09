package MultithreadingLearning.ThreadRunnable.Interrupt;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Thread interruptThread = new Thread(new MyThread());
        interruptThread.start();

        Thread.sleep(3000);
        interruptThread.interrupt();
    }
}
