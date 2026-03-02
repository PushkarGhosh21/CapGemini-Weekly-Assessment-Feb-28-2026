package Strings;

import java.util.Scanner;

public class Basa {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string with only 1 repeating character:");
		String sb=sc.nextLine();
		int count=0;
		char repeat='\0';
		 for(int i=0;i<sb.length();i++) {
			for(int j=i+1;j<sb.length();j++) {
					if((sb.charAt(i))==(sb.charAt(j)))
					{
						count++;
						repeat=sb.charAt(i);
					}	
			}
		}
		System.out.println(sb);
		System.out.println(repeat);
		System.out.println(count);
	}
}
