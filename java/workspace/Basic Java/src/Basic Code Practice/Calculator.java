package firstProject;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput=new Scanner(System.in);
		System.out.println("Enter first operand:");
		double n1=userInput.nextDouble();
		userInput.nextLine();
		System.out.println(" Enter +, - , * or /:");
		char c=userInput.next().charAt(0);
		System.out.println("Enter second operand:");
		double n2=userInput.nextDouble();
		userInput.nextLine();
		switch(c)
		{
		case '+':
			
			System.out.println(add(n1,n2));
	        break;
		case '-':
			System.out.println(subtract(n1,n2));
			break;
		case '*':
			System.out.println(multiply(n1,n2));
			break;
		case '/':
			System.out.println(divide(n1,n2));
			
		
		}
		
		
	}
	public static double add(double n1,double n2)
	{
		double sum=n1+n2;
		return sum;
	}
	public static double subtract(double n1,double n2)
	{
		double min=n1-n2;
		return min;
	}
	public static double multiply(double n1,double n2)
	{
		double prod=n1*n2;
		return prod;
	}
	public static double divide(double n1,double n2)
	{
		double div=n1/n2;
		return div;
	}
	

}
