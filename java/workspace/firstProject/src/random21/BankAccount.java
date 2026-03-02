package random21;

class InsufficientBalanceException extends Exception
{
	public InsufficientBalanceException(String mssg)
	{
		super(mssg);
	}
}
class BankAccounts {

	String name;
	double balance;
	BankAccounts(String name,double balance)
	{
		this.name=name;
		this.balance=balance;
	}
	BankAccounts(String name)
	{
		this.name=name;
		balance=0.0;
	}
	void withdrawable(double amt)throws InsufficientBalanceException
	{
		if(amt>balance) {
			throw new InsufficientBalanceException("Insufficient Balance ");
		}
		balance-=amt;
	}
	@Override
	public String toString()
	{
		return name+"| Balance:"+balance;
	}
	
}
public class BankAccount{
	public static void main(String[] args) {
        try {
            BankAccounts b = new BankAccounts("Pushkar", 5000);
            b.withdrawable(6000.0);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
