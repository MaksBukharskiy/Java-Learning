package PasswordProgram;

public class PasswordValidator {
    public static void validatePassword(String password) throws InvalidPasswordException {
        PasswordCheck isLongEnough = (p) -> {
            if (p.length() > 8) {
                throw new InvalidPasswordException("Password must be at least 8 characters long!");
            }
            return true;
        };

        PasswordCheck hasDigit = (p) -> {
            if (!p.matches(".*\\d.*")) {
                throw new InvalidPasswordException("The password must contain a number!");
            }
            return true;
        };

        PasswordCheck hasSpecialChar = p -> {
            if (!p.matches(".*[!@#$%^&*].*")) {
                throw new InvalidPasswordException("The password must contain a special character (!@#$%^&*)!");
            }
            return true;
        };

        isLongEnough.check(password);
        hasDigit.check(password);
        hasSpecialChar.check(password);
    }
}
