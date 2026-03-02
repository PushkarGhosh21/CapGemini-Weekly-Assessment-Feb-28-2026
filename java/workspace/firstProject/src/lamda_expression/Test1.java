package lamda_expression;
@FunctionalInterface
interface Draw
{
	void circle();
	//void rectangle() // Only 1 abstract method as it is a functional interface
}
//class C1 implements Draw
//{
//
//	@Override
//	public void circle()
//	{
//		System.out.println("C1 Draws") ;
//	}
//}
//class C2 implements Draw
//{
//
//	@Override
//	public void circle()
//	{
//		System.out.println("C2 Draws") ;
//	}
//}
public class Test1
{
	public static void main(String[] args) 
	{	//Lamda Expression 1
		Draw d=()->{System.out.println("C1 Draws");};
		//Calling circle function
		d.circle();
		//Lamda Expression 2
		Draw d2=()->{System.out.println("C2 Draws") ;};
		d2.circle();
	}
}
