package MultithreadingLearning.ThreadRunnable.FinalMultitreadingMailProgram;

import java.util.concurrent.ThreadLocalRandom;

public class EmailSenderOf implements EmailSender {

    @Override
    public void send(ClientEmailModel email) throws EmailException{
        try{
            Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 3000));
            System.out.println("Sent: " + email.getText());
        }
        catch (InterruptedException e){
            Thread.currentThread().interrupt();
            throw new EmailException("Sending interrupted");
        }
    }

}
