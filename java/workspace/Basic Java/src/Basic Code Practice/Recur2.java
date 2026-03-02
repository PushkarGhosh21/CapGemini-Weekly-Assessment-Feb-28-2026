package firstProject;

public class Recur2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		starPrint(5);
		
	}
	public static void starPrint(int count)
	{
		System.out.println("*");
		if(--count>0) //kab tak call karna hai
		{
			starPrint(count);
		}
		
		
	}
}
