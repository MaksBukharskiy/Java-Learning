package GenericsLearning;

public class GenericMain <T>{
    private T content;

    public void set(T content){
        this.content = content;
    }

    public T get() {  // Метод возвращает T
        return content;
    }
}
