package Strings;

import java.util.Scanner;

public class LengthRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		String s=sc.nextLine();
        System.out.println("Length of the String:"+s.length());
        for(int i=1;i<=s.length();i++)
        {
        	System.out.println(s);
        }
         
	}
	

}
