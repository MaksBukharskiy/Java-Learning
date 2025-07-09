package MultithreadingLearning.ThreadRunnable.FinalMultitreadingMailProgram;

import java.util.List;

public class ClientEmailModel {

    private final String username;
    private final String text;
    private final List<String> recipients;
    private final EmailPriority userPriority;


    public ClientEmailModel(String username, String text, List<String> recipients){
        this.username = username;
        this.text = text;
        this.recipients = recipients;
    }

    public String getUsername() {
        return username;
    }

    public String getText() {
        return text;
    }

    public List<String> getRecipients() {
        return recipients;
    }

}
