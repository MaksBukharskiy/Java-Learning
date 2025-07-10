package MultithreadingLearning.ThreadRunnable.FinalMultitreadingMailProgram;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public class EmailDispatcher {
    private final ExecutorService executor;
    private final EmailSender sender;
    private final AtomicInteger successCount = new AtomicInteger(0);
    private final AtomicInteger failureCount = new AtomicInteger(0);

    public EmailDispatcher(int threads) {
        this.executor = Executors.newFixedThreadPool(threads);
        this.sender = new EmailSenderOf();
    }

    public Future<Boolean> dispatch(ClientEmailModel email){
        return executor.submit(() -> {
            try{
                sender.send(email);
                successCount.incrementAndGet();
                return true;
            }
            catch(EmailException e){
                failureCount.incrementAndGet();
                return false;
            }
        });
    }

    public int getSuccessCount() {
        return successCount.get();
    }

    public int getFailureCount() {
        return failureCount.get();
    }

    public void shutdown(){
        executor.shutdown();
    }

}
