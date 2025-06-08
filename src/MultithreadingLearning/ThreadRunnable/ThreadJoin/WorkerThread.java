package MultithreadingLearning.ThreadRunnable.ThreadJoin;

public class WorkerThread extends Thread {
    @Override
    public void run(){
        System.out.println("Thread starts running");
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e){
            System.out.println("Thread interrupted");
        }

        System.out.println("Thread ends running");
    }
}


