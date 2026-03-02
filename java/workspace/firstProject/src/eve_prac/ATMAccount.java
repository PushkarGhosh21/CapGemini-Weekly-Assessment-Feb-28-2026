package eve_prac;

 interface ATMSystem
{
	void withdraw(double amt,int pin)throws InvalidTransactionException;
	void withdraw(double amt)throws InvalidTransactionException;
}
 //Checked Exception
 class InvalidTransactionException extends Exception
 {
	 public InvalidTransactionException(String messg)
	 {
		 super(messg);
     }
 }
 //Unchecked Exception
class InsufficientBalanceException extends RuntimeException
{
     public InsufficientBalanceException(String mssg)
     {
    	 super(mssg);
     }
}
abstract class ATMAccounts implements ATMSystem{

	private static long accountnumber;
	private static String holdername;
	private double balance;
	private double withlimit;
	private double withToday=0.0;
	
	protected ATMAccounts(long accno,String hname,double bal,double limit)
	{
		this.accountnumber=accno;
		this.holdername=hname;
		this.balance=bal;
		this.withlimit=limit;
	}
	
	protected double getBalance()
	{
		return balance;
	}
	protected void deduct(double amt)
	{
		balance-=amt;
		withToday+=amt;
	}
	protected void validate(double amt)throws InvalidTransactionException
	{
		if(amt>balance) {
			throw new InsufficientBalanceException("INSUFFICIENT BALANCE!");
		} else if(amt<0) {
			throw new InvalidTransactionException("INVALID AMOUNT ENTERED!");
		} else if(amt+withToday>withlimit) {
			throw new InvalidTransactionException("DAILY LIMIT EXCEEDED");
		}
	}
  }
class SavingsAcc extends ATMAccounts
{
	 SavingsAcc(long accno,String hname,double bal)
	{
		super(accno,hname,bal,1000000.0);
	}
	@Override
	public void withdraw(double amt,int pin)throws InvalidTransactionException
	{
		if(pin!=1234) {
			throw new InvalidTransactionException("WRONG PIN!");
		}
		withdraw(amt);
	}
	@Override
	public void withdraw(double amt) throws InvalidTransactionException {
		validate(amt);
		deduct(amt);
		getBalance();
		
	}
}	

class SalaryAcc extends ATMAccounts
{
     SalaryAcc(long accno,String hname,double bal)
	{
		super(accno,hname,bal,2000000.0);
	}
	@Override
	public void withdraw(double amt,int pin)throws InvalidTransactionException
	{
		if(pin!=9999) {
			throw new InvalidTransactionException("WRONG PIN!");
		}
		withdraw(amt);
	}
	@Override
	public void withdraw(double amt) throws InvalidTransactionException {
		validate(amt);
		deduct(amt);
		getBalance();
		
	}
}	

public class ATMAccount {

    // main method starts
    public static void main(String[] args) {

        ATMAccounts acc1 = new SavingsAcc(1234567, "Ravi", 30000);
        ATMAccounts acc2 = new SalaryAcc(1234567890, "Anita", 80000);

        try {

            acc1.withdraw(500, 1234);
            acc2.withdraw(20000, 9999);

        } catch (InvalidTransactionException e) {
            System.out.println(e.getMessage());
        } // try-catch ends

    } // main method ends

} // SecureATMSystem class ends

