package practice;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);
		System.out.println("Enter array size:");
		int n=userInput.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=userInput.nextInt();
		}
		System.out.println("The elements of the array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("The minimum elelment:"+min+" & the maximum element:"+max);
		userInput.close();

	}

}
