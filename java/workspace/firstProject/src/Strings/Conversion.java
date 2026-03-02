package Strings;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
        String s=sc.nextLine();
        System.out.println(con(s));
	}
	public static String con(String s)
	{
		String ns="";
		for(int i=0;i<s.length();i++)
		{
			if(Character.isLowerCase(s.charAt(i)))
				ns=ns+Character.toUpperCase(s.charAt(i));
			else if(Character.isUpperCase(s.charAt(i)))
				ns=ns+Character.toLowerCase(s.charAt(i));
			else
				ns=ns+s.charAt(i);
		}
		return ns;
	}

}
