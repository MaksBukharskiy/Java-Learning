package FinalEcxeption;

class NotEnoughMoneyException extends Exception {
    private double currentBalance;
    private double requiredAmount;

    public NotEnoughMoneyException(double current, double required) {
        super("Недостаточно средств. На счету: " + current + ", требуется: " + required);
        this.currentBalance = current;
        this.requiredAmount = required;
    }

    public double getMissingAmount() {
        return requiredAmount - currentBalance;
    }
}
