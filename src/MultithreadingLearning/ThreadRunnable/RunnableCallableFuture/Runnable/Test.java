package MultithreadingLearning.ThreadRunnable.RunnableCallableFuture.Runnable;

public class Test {
    public static void main(String[] args) {
        Runnable task = (() -> {
            System.out.println("Hello World");
        });

        Thread thread = new Thread(task);
        thread.start();

    }
}

