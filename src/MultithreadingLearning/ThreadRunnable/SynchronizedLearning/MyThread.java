package MultithreadingLearning.ThreadRunnable.SynchronizedLearning;

public class MyThread {
    private int counter = 0;

    public synchronized void increment(){
        counter++;
    }

    public int getCounter(){
        return counter;
    }
}
