package exception;

public class CustomCheckedExceptionDemo{
	public static void validateAge(int age)throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Age must be 18 or older to register.");
			
		}
		else if (age>=18 && age<=21)
		{
		System.out.println(Permit.SOFT);
		//throw new IndexOutOfBoundsException("Out of bounds");
		}
		else
			System.out.println(Permit.HARD);
	}
	public static void main(String [] args)
	{
	
		try {
			validateAge(21);
		}
		catch(InvalidAgeException e)
		{
			System.out.println("Caught Exception:"+e.getMessage());
		}
	}
	
}