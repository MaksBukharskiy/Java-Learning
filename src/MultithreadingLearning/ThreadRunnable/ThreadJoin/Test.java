package MultithreadingLearning.ThreadRunnable.ThreadJoin;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread starts");

        WorkerThread worker = new WorkerThread();
        worker.start();

        System.out.println("Main thread are waiting for worker to finish");
        worker.join();

        System.out.println("Main thread ends");
    }
}
