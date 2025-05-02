package FinalEcxeption;

public class InvalidAccountException extends RuntimeException {
    public InvalidAccountException(String accountNumber) {
        super("Неkoрректный номер счета: " + accountNumber);
    }
}