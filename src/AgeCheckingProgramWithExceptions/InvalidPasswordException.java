package AgeCheckingProgramWithExceptions;

public class InvalidPasswordException extends RuntimeException {
    public InvalidPasswordException(int password) {
        super("Your password is incorrect: " + password);
    }
}
