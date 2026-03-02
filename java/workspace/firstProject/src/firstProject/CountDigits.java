package firstProject;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int c=0;
		while(n!=0)
		{
			n=n/10;
			c++;			
		}
        System.out.println(c);
	}

}
