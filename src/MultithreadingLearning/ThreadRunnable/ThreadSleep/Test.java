package MultithreadingLearning.ThreadRunnable.ThreadSleep;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello World");

        new Thread(() -> {
            System.out.println("Thread starts working");

            try{
                System.out.println("Thread starts working for 3 sec");
                Thread.sleep(3000);
            }
            catch (InterruptedException e){
                System.out.println("Thread interrupted");
            }
            System.out.println("Thread ends working");
        }).start();

        System.out.println("Main Thread starts working");
    }
}
