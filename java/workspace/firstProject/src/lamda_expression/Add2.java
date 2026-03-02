package lamda_expression;
@FunctionalInterface
interface Add
{
	void sum(int a,int b);
}
public class Add2 
{

	public static void main(String[] args)
	{
		Add t=(int a,int b)->{System.out.println(a+b);};
		t.sum(5,10);
	}

}
