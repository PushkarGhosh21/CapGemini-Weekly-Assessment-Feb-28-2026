package firstProject;

import java.util.Scanner;

public class SumofFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner userInput=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=userInput.nextInt();
        sfact(n);
	}
	public static void sfact(int x)
	{
		int s=0;
		for(int i=1;i<=x;i++)
		{
			if((x%i)==0)
				s=s+i;
		}
		System.out.println(s);
	}

}
