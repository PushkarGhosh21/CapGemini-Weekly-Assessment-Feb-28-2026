package random21;

class InvalidAgeException extends RuntimeException
{
	public InvalidAgeException(String msg)
	{
		super(msg);
	}
}

class AgeValidation
{
	String name;
	int age;
	AgeValidation(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	AgeValidation(String name)
	{
		this.name=name;
		this.age=18;
	}
	void agecheck(int age)throws InvalidAgeException
	{
		if(age<18) {
			throw new InvalidAgeException("UNDERAGE");
		}
	}
	@Override
	public String toString()
	{
		return (name+"|Age:"+age);
	}
	
}

public class AgeValidations {

	public static void main(String[] args) 
	{
		AgeValidation a=new AgeValidation("Pg",21);
	}

}
