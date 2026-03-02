package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput=new Scanner(System.in);
		System.out.println("Enter 2 strings:");
		String s1=userInput.nextLine();
		String s2=userInput.nextLine();
		if (ana(s1,s2))
			System.out.println("Anagram");
		else
			System.out.println("NOT an Anagram");
		}
	public static boolean ana(String x,String y)
	{
		if(x.length()!=y.length())
			return false;
		char a[]=x.toCharArray();
		char b[]=y.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
				return false;
		}
		
		return true;
		
	}

}
