import java.util.Scanner;

public class newClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your GPA: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your GPA is: " + gpa);

        if (isStudent) {
            System.out.println("You are student");
        } else {
            System.out.println("You are not student");
        }

        scanner.close();
    }
}




