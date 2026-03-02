package firstProject;

import java.util.Scanner;

public class SwapWithThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=b;
		b=a;
		a=c;
		System.out.println(a + " "+b);

	}

}
