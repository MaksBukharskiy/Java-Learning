package PasswordProgram;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        try{
            PasswordValidator.validatePassword(password);
            System.out.println("✅ Password is valid!");
        }

        catch (InvalidPasswordException e){
            System.err.println("❌ Error: " + e.getMessage());
        }

    }
}
