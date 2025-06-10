package MultithreadingLearning.ThreadRunnable.Volatile;

public class MyThread{
    private volatile boolean active = true;

    public void start(){
        new Thread(() -> {
            int seconds = 0;
            while(active){
                System.out.println("Seconds " + ++seconds);

                try{
                    Thread.sleep(2000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public void stop(){
        active = false;
    }
}

