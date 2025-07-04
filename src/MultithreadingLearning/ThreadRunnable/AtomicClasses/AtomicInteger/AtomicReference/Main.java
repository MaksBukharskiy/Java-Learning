package MultithreadingLearning.ThreadRunnable.AtomicClasses.AtomicInteger.AtomicReference;

public class Main {
    public static void main(String[] args) {

        ThemeManager themeManager = new ThemeManager("Dark");
        themeManager.setCurrentTheme("Light");

        new Thread(() -> {
            if (themeManager.getCurrentTheme().equals("Dark")) {
                System.out.println("Current Theme is Dark");
            }
            else {
                System.out.println("Current Theme is Light");
            }
        }).start();

        try{
            Thread.sleep(2000);
            System.out.println("The end");
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
}
