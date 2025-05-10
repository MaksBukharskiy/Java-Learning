package Passwordddddddd;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            System.out.print("Enter password: ");
            int password = sc.nextInt();


            try{
                PassworddValidator.PasswordValidate(password);
                System.out.println("✅ Password is valid!");
            }

            catch (InvalidPasswordExceptionn e){
                System.err.println("❌ Error: " + e.getMessage());
            }
        }

        catch (InputMismatchException e){
            System.err.println("Error: Please enter numbers only");
            sc.nextLine();
        }

        finally {
            sc.close();
        }
    }
}
