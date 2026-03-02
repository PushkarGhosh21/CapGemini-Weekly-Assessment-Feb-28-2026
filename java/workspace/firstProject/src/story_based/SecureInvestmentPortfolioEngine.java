package story_based;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// -------------------- ENUM --------------------
enum InvestmentType {
    EQUITY,
    DEBT
}

// -------------------- INTERFACE --------------------
interface InvestmentAuthorization {
    void authorize();
    void authorize(String securityCode);
}

// -------------------- CHECKED EXCEPTION --------------------
class InvalidInvestmentException extends Exception {
    public InvalidInvestmentException(String message) {
        super(message);
    }
}

// -------------------- UNCHECKED EXCEPTION --------------------
class InvestmentRejectedException extends RuntimeException {
    public InvestmentRejectedException(String message) {
        super(message);
    }
}

// -------------------- IMMUTABLE ABSTRACT CLASS --------------------
abstract class InvestmentTransaction implements InvestmentAuthorization {

    private final String transactionId;
    private final String investorName;
    private final double investedAmount;
    private final InvestmentType investmentType;

    protected InvestmentTransaction(
            String transactionId,
            String investorName,
            double investedAmount,
            InvestmentType investmentType
    ) throws InvalidInvestmentException {

        if (transactionId == null || investorName == null) {
			throw new InvalidInvestmentException("Transaction ID or Investor Name cannot be null");
		}

        if (investedAmount <= 0) {
			throw new InvalidInvestmentException("Investment amount must be greater than zero");
		}

        this.transactionId = transactionId;
        this.investorName = investorName;
        this.investedAmount = investedAmount;
        this.investmentType = investmentType;
    }

    // ---- Controlled Accessors ----
    public String getTransactionId() {
        return transactionId;
    }

    public String getInvestorName() {
        return investorName;
    }

    public double getInvestedAmount() {
        return investedAmount;
    }

    public InvestmentType getInvestmentType() {
        return investmentType;
    }

    // ---- Immutability-preserving transformation ----
    public abstract InvestmentTransaction applyAdjustment(double percentage)
            throws InvalidInvestmentException;
}

// -------------------- EQUITY INVESTMENT --------------------
final class EquityInvestment extends InvestmentTransaction {

    public EquityInvestment(
            String id,
            String name,
            double amount
    ) throws InvalidInvestmentException {
        super(id, name, amount, InvestmentType.EQUITY);
    }

    // Equity: bonus-based adjustment
    @Override
    public InvestmentTransaction applyAdjustment(double bonusPercentage)
            throws InvalidInvestmentException {

        if (bonusPercentage < 0 || bonusPercentage > 30) {
			throw new InvalidInvestmentException("Bonus must be between 0 and 30%");
		}

        double newAmount = getInvestedAmount()
                + (getInvestedAmount() * bonusPercentage / 100);

        return new EquityInvestment(
                getTransactionId(),
                getInvestorName(),
                newAmount
        );
    }

    @Override
    public void authorize() {
        throw new InvestmentRejectedException("Equity investment requires security code");
    }

    @Override
    public void authorize(String securityCode) {
        if (!"EQT123".equals(securityCode)) {
			throw new InvestmentRejectedException("Invalid equity security code");
		}

        System.out.println("Equity investment authorized");
    }
}

// -------------------- DEBT INVESTMENT --------------------
final class DebtInvestment extends InvestmentTransaction {

    public DebtInvestment(
            String id,
            String name,
            double amount
    ) throws InvalidInvestmentException {
        super(id, name, amount, InvestmentType.DEBT);
    }

    // Debt: tax-based adjustment
    @Override
    public InvestmentTransaction applyAdjustment(double taxPercentage)
            throws InvalidInvestmentException {

        if (taxPercentage < 0 || taxPercentage > 30) {
			throw new InvalidInvestmentException("Tax must be between 0 and 30%");
		}

        double newAmount = getInvestedAmount()
                - (getInvestedAmount() * taxPercentage / 100);

        return new DebtInvestment(
                getTransactionId(),
                getInvestorName(),
                newAmount
        );
    }

    @Override
    public void authorize() {
        System.out.println("Debt investment authorized (low risk)");
    }

    @Override
    public void authorize(String securityCode) {
        authorize(); // security code not required
    }
}

// -------------------- CUSTOM COMPARATOR --------------------
class InvestmentAmountComparator
        implements Comparator<InvestmentTransaction> {

    @Override
    public int compare(
            InvestmentTransaction a,
            InvestmentTransaction b
    ) {
        return Double.compare(a.getInvestedAmount(), b.getInvestedAmount());
    }
}

// -------------------- TEST CLASS --------------------
public class SecureInvestmentPortfolioEngine {

    public static void main(String[] args) {

        try {
            InvestmentTransaction inv1 =
                    new EquityInvestment("TXN101", "Amit", 100000);

            InvestmentTransaction inv2 =
                    new DebtInvestment("TXN202", "Neha", 80000);

            // Authorization
            inv1.authorize("EQT123");
            inv2.authorize();

            // Immutable transformation
            InvestmentTransaction inv1Adjusted =
                    inv1.applyAdjustment(10); // bonus

            InvestmentTransaction inv2Adjusted =
                    inv2.applyAdjustment(5);  // tax

            List<InvestmentTransaction> list = new ArrayList<>();
            list.add(inv1Adjusted);
            list.add(inv2Adjusted);

            Collections.sort(list, new InvestmentAmountComparator());

            for (InvestmentTransaction inv : list) {
                System.out.println(
                        inv.getInvestmentType() + " -> " + inv.getInvestedAmount()
                );
            }

        } catch (InvalidInvestmentException e) {
            System.out.println(e.getMessage());
        }
    }
}
