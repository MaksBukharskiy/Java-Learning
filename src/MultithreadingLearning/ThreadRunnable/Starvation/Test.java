package MultithreadingLearning.ThreadRunnable.Starvation;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Runnable highPriorityTask = () -> {
            for (int i = 0; i < 5; i++) {
                synchronized (MyThread.lock) {
                    System.out.println(Thread.currentThread().getName() + " is running");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread thread1 = new Thread(highPriorityTask, "High Priority 1");
        Thread thread2 = new Thread(highPriorityTask, "High Priority 2");

        Thread lowPriority = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                synchronized (MyThread.lock) {
                    System.out.println(Thread.currentThread().getName() + " is running");
                }
            }
        }, "Low Priority 1");

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);

        lowPriority.setPriority(Thread.MIN_PRIORITY);


        thread1.start();
        thread2.start();
        lowPriority.start();

    }
}
