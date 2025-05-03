package AgeCheckingProgramWithExceptions;

public class Test {
    public static void main(String[] args) {
        AgeChecking age1 = new AgeChecking(12, 1203);

        try{
            age1.CheckThisAge(12);
        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }

        /// //////////////////////////////////////////

        try{
            age1.CheckThisPassword(1203);
        }
        catch (InvalidPasswordException e){
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("\nOperation finished successfully");
        }
    }
}
