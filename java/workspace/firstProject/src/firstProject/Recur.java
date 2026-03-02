package firstProject;

public class Recur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		starPrint(5);

	}
	public static void starPrint(int count)
	{
		System.out.println("*");
		if(--count==0)//kab rokna hai
		{
			return;
		}
		starPrint(count);
		
	}

}
