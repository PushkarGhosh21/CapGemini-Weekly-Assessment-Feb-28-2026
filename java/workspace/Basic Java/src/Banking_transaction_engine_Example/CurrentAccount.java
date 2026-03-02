package banking_transaction_engine;

public class CurrentAccount extends AccountDetails {

    private double overdraftLimit;

    public CurrentAccount(long accountNumber, String accountHolder, long pin, double initialBalance, double overdraftLimit) {
        super(accountNumber, accountHolder, pin, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("=== Current Account (Overdraft Limit: " + overdraftLimit + ") ===");
    }

    @Override
    public void withdraw(long inputPin, double amount) throws InvalidAmountException {
        if (!validatePin(inputPin)) {
            throw new SecurityException("Invalid PIN!");
        }
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be positive");
        }

        double currentBal = getBalanceField();
        double newBal = currentBal - amount;

 
        if (newBal < -overdraftLimit) {
            throw new InsufficientBalanceException("Overdraft Limit Exceeded. Max withdrawable: " + (currentBal + overdraftLimit));
        }

        setBalanceField(newBal);
        System.out.println("Withdrawal Successful. New Balance: " + newBal);
    }
}