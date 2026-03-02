package string_practice;

import java.util.Scanner;

public class NumberOfCharacters {

	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=userInput.next();
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			c++;
		}
		System.out.println("Number of characters in string "+s+" is:"+c);
        userInput.close();
	}

}
