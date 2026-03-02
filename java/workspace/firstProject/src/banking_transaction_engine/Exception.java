package banking_transaction_engine;

// Checked Exception: Forces handling (try-catch) for invalid inputs
class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

// Unchecked Exception: Runtime errors for logic violations (like overdraft)
class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}