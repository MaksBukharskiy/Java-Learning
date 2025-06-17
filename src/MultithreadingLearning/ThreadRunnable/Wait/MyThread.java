package MultithreadingLearning.ThreadRunnable.Wait;

public class MyThread {
    private final Object lock = new Object();

    public void waitForSignal(String name){
        synchronized(lock){
            try{
                System.out.println(name + "Is waiting... ");
                lock.wait();
                System.out.println(name + "get signal");
            }
            catch(InterruptedException e){
                System.out.println(name + "Is interrupted... ");
                Thread.currentThread().interrupt();
            }
        }
    }

    public void wakeAll(){
        synchronized(lock){
            System.out.println("Is waking... ");
            lock.notifyAll();
        }
    }
}
