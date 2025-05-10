package Passwordddddddd;

public class PassworddValidator {
    public static void PasswordValidate(int password) throws InvalidPasswordExceptionn{
        PasswordCheck isLong = (p) -> {
            if (p > 100){
                throw new InvalidPasswordExceptionn("Your password is long");
            }
            return true;
        };

        PasswordCheck isShort = (p) -> {
            if(p < 10){
                throw new InvalidPasswordExceptionn("Your password is short");
            }
            return true;
        };

        isLong.passwordCheck(password);
        isShort.passwordCheck(password);

    }
}
