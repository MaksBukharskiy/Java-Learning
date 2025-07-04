package MultithreadingLearning.ThreadRunnable.AtomicClasses.AtomicInteger.AtomicReference;

import java.util.concurrent.atomic.AtomicReference;

public class ThemeManager {

    private final AtomicReference<String> currentTheme;

    public ThemeManager(String initialTheme){
        this.currentTheme = new AtomicReference<>(initialTheme);
    }

    public String getCurrentTheme(){
        return currentTheme.get();
    }

    public void setCurrentTheme(String newTheme){
        currentTheme.set(newTheme);
    }

}
