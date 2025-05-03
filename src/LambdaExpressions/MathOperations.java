package LambdaExpressions;

interface MathOperations {
    int operate(int a, int b);

    default void printResult(int result){
        System.out.println("Your result is " + result);
    }
}
