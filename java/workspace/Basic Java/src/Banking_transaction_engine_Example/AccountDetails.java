package banking_transaction_engine;

// Interface Definition
interface BankAccountOperations {
    void deposit(long pin, double amount) throws InvalidAmountException;
    void withdraw(long pin, double amount) throws InvalidAmountException;
    double checkBalance();
}

// Abstract Base Class
public abstract class AccountDetails implements BankAccountOperations {
    
    private final long accountNumber;
    private final String accountHolder;
    private final long pin; 
    private double balance;

    // Constructor to initialize final variables
    public AccountDetails(long accountNumber, String accountHolder, long pin, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.pin = pin;
        this.balance = initialBalance;
    }

    // Helper to validate PIN (Internal use only)
    protected boolean validatePin(long inputPin) {
        return this.pin == inputPin;
    }

    // Controlled access to Balance for child classes
    protected double getBalanceField() {
        return balance;
    }

    protected void setBalanceField(double newBalance) {
        this.balance = newBalance;
    }

    @Override
    public void deposit(long inputPin, double amount) throws InvalidAmountException {
        if (!validatePin(inputPin)) {
            throw new SecurityException("Invalid PIN entered.");
        }
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive.");
        }
        
        this.balance += amount; 
        System.out.println("Deposit Successful. New Balance: $" + this.balance);
    }

    @Override
    public double checkBalance() {
        return this.balance;
    }

    // Abstract method forcing child classes to identify themselves
    public abstract void displayAccountType();
}