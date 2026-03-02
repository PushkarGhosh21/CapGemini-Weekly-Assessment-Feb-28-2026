package firstProject;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=userInput.nextInt();
		prim(n);
		

	}
	public static void prim(int x)
	{
		int c=0;
		for(int i=2;i<x;i++)
		{
			if((x%i)==0)
				c++;
		}
		if(c>0)
			System.out.println("Not prime");
		else
			System.out.println("Prime");
	}

}
