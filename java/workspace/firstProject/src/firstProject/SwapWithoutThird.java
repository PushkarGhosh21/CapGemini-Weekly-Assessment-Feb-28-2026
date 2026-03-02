package firstProject;

import java.util.Scanner;

public class SwapWithoutThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of 'a' and 'b':");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before swapping value of 'a' and 'b':"+a+","+b);
		System.out.println("After swapping:");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a:"+a+" & "+"b:"+b);

	}

}
