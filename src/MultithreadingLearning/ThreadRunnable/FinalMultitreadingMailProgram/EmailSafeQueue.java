package MultithreadingLearning.ThreadRunnable.FinalMultitreadingMailProgram;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class EmailSafeQueue {
    private final BlockingQueue<ClientEmailModel> queue = new LinkedBlockingQueue<>();

    public void add(ClientEmailModel email){
        queue.add(email);
    }

    public ClientEmailModel take () throws InterruptedException {
        return queue.take();
    }

}
