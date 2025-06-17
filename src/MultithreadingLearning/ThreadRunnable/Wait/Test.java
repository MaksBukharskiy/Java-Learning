package MultithreadingLearning.ThreadRunnable.Wait;

public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        new Thread(() -> myThread.waitForSignal("Thread-1")).start();
        new Thread(() -> myThread.waitForSignal("Thread-2")).start();
        new Thread(() -> myThread.waitForSignal("Thread-3")).start();

        new Thread(myThread::wakeAll).start();
    }
}
