package p1;

import java.util.Scanner;

public class MultiD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr= {{1,2},
			       	{3,4,5},
			       	{6}
		             };
		elements(arr);

	}
	public static void elements(int [][]arr) {
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
