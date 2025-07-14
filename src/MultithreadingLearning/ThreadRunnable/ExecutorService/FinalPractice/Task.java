package MultithreadingLearning.ThreadRunnable.ExecutorService.FinalPractice;

import java.util.concurrent.Callable;

public class Task implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("salam");
        Thread.sleep(5000);
        return 52222;
    }
}
