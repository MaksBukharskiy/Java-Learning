package FinalEcxeption;

public class Test {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("1234-5678-9012", 1000);
        BankAccount account2 = new BankAccount("9876-5432-1098", 500);
        BankAccount invalidAccount = new BankAccount("123", 0);

        try {
            account1.transferTo(account2, 500);
            account1.transferTo(invalidAccount, 1000);
        }
        catch (NotEnoughMoneyException e) {
            System.out.println("Ошибка перевода: " + e.getMessage());
            System.out.println("Не хватает: " + e.getMissingAmount());
        } catch (InvalidAccountException e) {
            System.out.println("Ошибка в номере счета: " + e.getMessage());
        } finally {
            System.out.println("Операция завершена");
        }

    }
}
