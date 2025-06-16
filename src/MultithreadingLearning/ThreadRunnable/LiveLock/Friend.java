package MultithreadingLearning.ThreadRunnable.LiveLock;

import java.lang.Thread;

public class Friend {
    private final String name;
    int attempts = 0;

    public Friend(String name) {
        this.name = name;
    }

    public void work(Friend otherFriend){
        while (attempts < 5){
            System.out.println(name +" ждёт, чтобы " + otherFriend.name + " начал работать");

            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            attempts++;
        }
    }
}
