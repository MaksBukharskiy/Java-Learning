package GenericPractice;

public class GenericTest {
    public static void main(String[] args) {
        Printer <Integer> printer = new Printer<>(52);
        printer.print();

        Printer<String> printerString = new Printer<>("Something");
        printerString.print();

        Printer <Double> printerDouble = new Printer<>(1212.0);
        printerDouble.print();
    }
}
