package Strings;

import java.util.Scanner;

public class FirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=sc.nextLine();
		char f=s.charAt(0);
		char l=s.charAt(s.length()-1);
		System.out.println("First Character:"+f+" & Last Character:"+l);
    
	}
	
}
