import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;

        do {
            System.out.print("Enter your password: ");
            password = sc.nextLine();
        }
        while (!password.equals("secret"));{
            System.out.println("Success");
        }
    }
}
