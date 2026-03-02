package Strings;

import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String s=sc.nextLine();
		System.out.println(rem(s));

	}
	public static String rem(String s) {
	    int start = 0;
	    for (int i = 0; i < s.length(); i++) {
	        if (s.charAt(i) != ' ') {
	            start = i; 
	            break; 
	        }
	    }
	    String ns = "";
	    for (int i = start; i < s.length(); i++) {
	        ns += s.charAt(i);
	    }

	    return ns;
	}

}
