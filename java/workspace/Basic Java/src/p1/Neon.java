package p1;

import java.util.Scanner;

public class Neon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Input:");
		int n=sc.nextInt();
		neon(n);

	}
	public static void neon(int x)
	{
		int num=x*x;
		int s=0;
		while(num!=0)
		{
			int d=num%10;
			s=s+d;
			num=num/10;
		}
		if(s==x)
			System.out.println(x+" is a Neon number");
		else
			System.out.println(x+" is NOT a Neon number");
	}

}
