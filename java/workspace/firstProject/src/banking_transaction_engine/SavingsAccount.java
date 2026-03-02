package banking_transaction_engine;

public class SavingsAccount extends AccountDetails {
    
    private static final double MIN_BALANCE = 00.00;

    public SavingsAccount(long accountNumber, String accountHolder, long pin, double initialBalance) {
        super(accountNumber, accountHolder, pin, initialBalance);
    }

    @Override
    public void displayAccountType() {
        System.out.println("=== Savings Account (Min Balance Required: $" + MIN_BALANCE + ") ===");
    }

    @Override
    public void withdraw(long inputPin, double amount) throws InvalidAmountException {
        if (!validatePin(inputPin)) {
            throw new SecurityException("Invalid PIN!");
        }
        
        // Savings Rule: Check if withdrawal violates minimum balance//
        if (getBalanceField() - amount < MIN_BALANCE) {
            throw new InsufficientBalanceException("Transaction Declined. Savings account must maintain " + MIN_BALANCE);
        }

        // Use parent logic to update balance if rule passes
        // We manually update here because parent withdraw (if defined) might not exist or be different
        if (amount <= 0) throw new InvalidAmountException("Amount must be positive");
        
        setBalanceField(getBalanceField() - amount);
        System.out.println("Withdrawal Successful. New Balance: $" + getBalanceField());
    }
}