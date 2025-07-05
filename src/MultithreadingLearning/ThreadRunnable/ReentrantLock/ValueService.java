package MultithreadingLearning.ThreadRunnable.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class ValueService {

    private final ReentrantLock lock = new ReentrantLock();
    private int value = 0;

    public void increment(){
        try{
            lock.lock();
            value++;

            System.out.println(Thread.currentThread().getName() + ": " + value);
        }
        finally {
            lock.unlock();
        }
    }

    public int getValue(){
        return value;
    }
}
