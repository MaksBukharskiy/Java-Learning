package FinalEcxeption;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void transferTo(BankAccount recipient, double amount)
            throws NotEnoughMoneyException, InvalidAccountException{
        if(recipient == null || !recipient.accountNumber.matches("\\d{4}-\\d{4}-\\d{4}")){
            throw new InvalidAccountException(
                    recipient != null ? recipient.accountNumber : "null"
            );
        }

        if(amount > balance){
            throw new NotEnoughMoneyException(balance, amount);
        }

        // Если все ок - выполняем перевод
        this.balance -= amount;
        recipient.balance += amount;

        System.out.println("Переведено " + amount + " со счета " + accountNumber + " на счет " + recipient.accountNumber);
    }
}
