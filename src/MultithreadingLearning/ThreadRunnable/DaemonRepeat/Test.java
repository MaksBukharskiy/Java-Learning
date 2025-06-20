package MultithreadingLearning.ThreadRunnable.DaemonRepeat;

public class Test {
    public static void main(String[] args) {
        Thread daemon = new Thread(() -> {
            while(true){
                System.out.println("Daemon is running");

                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
        });

        daemon.setDaemon(true);
        daemon.start();

        System.out.println("Main is ending");
    }
}
