package exception_unchecked;

public class InsufficientBalance extends RuntimeException {
	public InsufficientBalance(String message)
	{
		super(message);
	}

}
