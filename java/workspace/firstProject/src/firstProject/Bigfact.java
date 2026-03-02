package firstProject;

import java.math.BigInteger; //Importing BigInteger class from java.math package
import java.util.Scanner;

public class Bigfact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//In case of factorial of big numbers in java
		//we import the BigInteger class as it has the capability to store the answer
		
		Scanner userInput=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=userInput.nextInt();
		fact(n);

	}
	public static void fact(int x)
	{
		//here normally we do int f=1;
		//But since it is BigInteger so we call the constant BigInteger ONE
		BigInteger f=BigInteger.ONE;
		for(int i=1;i<=x;i++)
			f=f.multiply(BigInteger.valueOf(i)); //BigInteger value operates with BigInteger so
		                                        //we convert int to BigInteger 
		System.out.println("Factorial of"+" "+x+" is:"+f);
			
		
	}

}
