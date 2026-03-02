package exception_unchecked;


public class CustomUncheckedException {
	public static void withdraw(double balance,double amount)
	{
		if(amount>balance) {
			throw new InsufficientBalance("Withdrawl amount exceeds balance");
		}
		System.out.println("Withdrawal Successful.Current Amount:"+(balance-amount));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double balance=50000;
		double withdrawal=300000;
		try {
			withdraw(balance,withdrawal);
		}
		catch (InsufficientBalance e){
			System.out.println("EXCEPTION:"+e.getMessage());
		}

	}

}
