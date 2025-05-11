package GenericsLearning;

public class Test {
    public static void main(String[] args) {
        GenericMain<String> stringBox = new GenericMain<>();
        stringBox.set("Hello");
        String value = stringBox.get();

        GenericMain<Integer> intBox = new GenericMain<>();
        intBox.set(123);
        int number = intBox.get();

        System.out.println(value);
        System.out.println(number);
    }
}
