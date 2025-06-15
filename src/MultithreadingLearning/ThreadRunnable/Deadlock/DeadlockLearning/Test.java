package MultithreadingLearning.ThreadRunnable.Deadlock.DeadlockLearning;

public class Test {
    public static void main(String[] args) {
        Object a = new Object();
        Object b = new Object();

        new Thread(() -> {
            synchronized(a) {
                System.out.println("Поток 1 захвачен");

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Поток 1: Пытаюсь захватить 2 поток");
                synchronized (b) {
                    System.out.println("Поток 1: Захвачены оба объекта");
                }
            }
        },"Поток 1").start();

        new Thread(() -> {
            synchronized (b) {
                System.out.println("Поток 2 Захвачен");
                try {
                    Thread.sleep(100); // имитация работы
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Поток 2: Пытаюсь захватить 1 поток");
                synchronized (a) {
                    System.out.println("Поток 2: Захвачены оба объекта");
                }
            }
        }, "Thread-2").start();
    }
}
