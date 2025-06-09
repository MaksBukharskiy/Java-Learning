package MultithreadingLearning.ThreadRunnable.Interrupt;

public class MyThread implements Runnable{
    @Override
    public void run(){
        while (!Thread.currentThread().isInterrupted()){
            System.out.println("My thread is running");

            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("My thread is interrupted");
                Thread.currentThread().interrupt();
                break;
            }

            System.out.println("My thread ended work");
        }
    }
}
