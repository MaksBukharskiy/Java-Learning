package MethodChaining;

public class Test {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        int result = calc.add(10).substract(5).add(1).getResult();
        System.out.println("Your result is: " + result);
    }
}
