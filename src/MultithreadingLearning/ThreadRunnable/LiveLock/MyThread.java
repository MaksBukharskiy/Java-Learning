package MultithreadingLearning.ThreadRunnable.LiveLock;

public class MyThread {
    public static void main(String[] args) throws InterruptedException {
        Friend maks = new Friend("Maks");
        Friend john = new Friend("John");

        new Thread(() -> maks.work(john)).start();
        new Thread(() -> john.work(maks)).start();

    }
}
