package Strings;

import java.util.Scanner;

public class ConvertLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string in uppercase:");
		String s=sc.nextLine();
        System.out.println(lower(s));
	}
	public static String lower(String s)
	{
		String ns=s.toLowerCase();
		return ns;
	}

}
