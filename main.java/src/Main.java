import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double height = 0;
        double width = 0;
        double result = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the height in meters: ");
        height = input.nextDouble();

        System.out.print("Enter the width in meters: ");
        width = input.nextDouble();

        result = height * width;
        System.out.println("The result is: " + result);
    }
}