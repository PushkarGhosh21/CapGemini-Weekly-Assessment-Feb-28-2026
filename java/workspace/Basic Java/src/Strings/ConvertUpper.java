package Strings;

import java.util.Scanner;

public class ConvertUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string in lowercase:");
		String s=sc.nextLine();
        System.out.println(upper(s));
	}
	public static String upper(String s)
	{
		String ns=s.toUpperCase();
		return ns;
	}

}
