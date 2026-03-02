package lamda_expression;

interface Fact
{
	void factcheck(int n);
}

public class Factorial 
{

	public static void main(String[] args) 
	{
		Fact f=(int n)->{
			         int fac=1;
			         for(int i=1;i<=n;i++) 
			         {fac=fac*i;}
			         System.out.println(fac);};
			
			f.factcheck(5);
	}

}
