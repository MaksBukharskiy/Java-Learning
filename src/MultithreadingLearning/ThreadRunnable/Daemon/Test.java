package MultithreadingLearning.ThreadRunnable.Daemon;

public class Test {
    public static void main(String[] args) {
        Thread daemon = new Thread(() -> {
            while(!Thread.currentThread().isInterrupted()) {
                System.out.println("Daemon is working");
                try{
                    Thread.sleep(2000);
                }
                catch(InterruptedException e){
                    break;
                }
            }
        });

        daemon.setDaemon(true);
        daemon.start();

        System.out.println("Main thread is ending");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Основной поток завершился.");
    }
}
