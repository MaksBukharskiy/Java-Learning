package MultithreadingLearning.ThreadRunnable.FinalMultitreadingMailProgram;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmailSafeQueue emailQueue = new EmailSafeQueue();
        EmailDispatcher dispatcher = new EmailDispatcher(4);

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                ClientEmailModel email = new ClientEmailModel(
                        "Maks " + i,
                        "Hello " + i,
                        List.of("user number " + i)
                );
                emailQueue.add(email);
                System.out.println("Added: " + email.getUsername());
            }
        }).start();


        new Thread(() -> {
            while (true) {
                try{
                    ClientEmailModel email = emailQueue.take();
                    dispatcher.dispatch(email);
                }
                catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }).start();


        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(3000);
                    System.out.printf("Stats: Success=%d, Failed=%d\n",
                            dispatcher.getSuccessCount(),
                            dispatcher.getFailureCount());
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }).start();

    }
}

