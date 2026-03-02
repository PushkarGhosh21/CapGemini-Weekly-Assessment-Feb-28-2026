package firstProject;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=userInput.nextInt();
		rev(n);

	}
	public static void rev(int x)
	{
		int s=0;
		int dd=x;
		while(x!=0)
		{
			int d=x%10;
			s=s*10 +d;
			x=x/10;
		}
		System.out.println("Reverse of "+dd+" is "+s);
	}

}
