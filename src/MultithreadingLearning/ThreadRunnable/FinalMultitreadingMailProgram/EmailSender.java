package MultithreadingLearning.ThreadRunnable.FinalMultitreadingMailProgram;

public interface EmailSender {
    void send(ClientEmailModel email) throws EmailException;
}
