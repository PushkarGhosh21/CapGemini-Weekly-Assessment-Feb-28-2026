package lamda_expression;

@FunctionalInterface
interface Addi
{
	int sum(int a,int b);
}
@FunctionalInterface
interface Minus
{
	int diff(int a,int b);
}
@FunctionalInterface
interface Div
{
	double divisiom(double a,double b);
}
@FunctionalInterface
interface Multiply
{
	int prod(int a,int b);
}
public class Calculator {

	public static void main(String[] args)
	{
	   Addi as=(int a,int b)->{return (a+b);};
	   System.out.println(as.sum(10, 20));
	   Minus m=(int a,int b)->{return (a-b);};
	   System.out.println(m.diff(10, 20));
	   Div d=(double a,double b)->{return (a/b);};
	   System.out.println(d.divisiom(10, 20));
	   Multiply mul=(int a,int b)->{return (a*b);};
	   System.out.println(mul.prod(10, 20));
	};

}
