package p1;

import java.util.Scanner;

public class Uarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner userInput=new Scanner(System.in);
			Object[] arr=new Object[5];
			System.out.println("Enter array elements:");
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=userInput.nextLine();
			}
			System.out.println("The array elements:");
			
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
	}

}
