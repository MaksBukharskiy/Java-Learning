package PasswordProgram;

@FunctionalInterface
public interface PasswordCheck {
    boolean check(String password) throws InvalidPasswordException;
}
