package MultithreadingLearning.ThreadRunnable.Deadlock;

public class ThreadOne {
    public synchronized void access(ThreadTwo threadTwo){
        System.out.println("Thread: " + Thread.currentThread().getName() + " access");

        try{
            Thread.sleep(2000);
        }

        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Trying to get monitor of resourse");
        threadTwo.lastMethod();
    }

    public synchronized void lastMethod(){
        System.out.println("Called ThreadOne.lastMethod()");
    }
}
