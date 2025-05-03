package AgeCheckingProgramWithExceptions;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(int age) {
        super("You are not an adult, you are " + age + " years old.");
    }
}
