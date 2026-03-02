package method_overloading;

public class Calculator {

	public static void addition()
	{
		//Base1
	}
	public static void addition(double op1,double op2)
	{
		//Overloading achieved by changing number of formal arguments
		//with respect to Base 1
		
		// Base 2
	}
	public static void addition(float op1,double op2)
	{
		//Overloading achieved by changing data type of formal arguments
		//with respect to Base 2
		
		// Base 3
	}
	public static void addition(double op1,float op2)
	{
		//Overloading achieved by changing sequence of data type of formal arguments
		//with respect to Base 3
		
		// Base 4
	}
	public static void addition(double op1,char opr,double op2)
	{
		//Overloading achieved by changing number,data type, sequence of data type of formal arguments
		//with respect to Base 3
		
		// Base 5
	}

}
