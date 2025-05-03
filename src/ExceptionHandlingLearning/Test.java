package ExceptionHandlingLearning;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        String str = null;

        int a = 10;
        int b = 0;

        try {
            System.out.println(str.length());
        }
        catch(NullPointerException e){
            System.out.println("Error, attempt to call on null object");
        }

        try{
            int result = a / b;
            System.out.println("Result is " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Sorry, but you cant divide by zero " + b);
        }

        finally {
            System.out.println();
            System.out.println("Program has successfully ended");
        }
    }
}