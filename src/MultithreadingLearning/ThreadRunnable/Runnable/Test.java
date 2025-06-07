package MultithreadingLearning.ThreadRunnable.Runnable;

public class Test {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        thread.start();
    }
}
