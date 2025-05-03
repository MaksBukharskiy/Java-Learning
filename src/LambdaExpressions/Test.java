package LambdaExpressions;

public class Test {
    public static void main(String[] args) {
        MathOperations addition = (a, b) -> a + b;
        MathOperations substraction = (a, b) -> a - b;

        int sum1 = addition.operate(5, 90);
        int sum2 = substraction.operate(10, 2);

        addition.printResult(sum1);
        substraction.printResult(sum2);

        Greeter greeting = name -> System.out.println("Hello, " + name);
        greeting.greet("Maks");
    }
}
