package MultithreadingLearning.ThreadRunnable.SynchronyzedBlock;

public class MyThread {
    private int count = 0;
    private final Object lock = new Object();

    public void increment(){
        synchronized (lock){
            count++;
        }
    }

    public int getCount(){
        return count;
    }
}
