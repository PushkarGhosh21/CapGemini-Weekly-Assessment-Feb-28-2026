package firstProject;

import java.util.Scanner;



public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=userInput.nextInt();
		Fact(n);
		

	}
	public static void Fact(int x)
	{
		int f=1;
		for(int i=1;i<=x;i++)
		f=f*i;
		System.out.println("Factorial of "+x+" is:"+f);
	}

}
