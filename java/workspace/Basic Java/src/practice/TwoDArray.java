package practice;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr= {{1,2},{3,4},{5,6}};//Array declaration and initialization
		//int arr1[][]=new int[2][2]; //Just initialization 
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
		System.out.println(arr[i][j]);
		}
	}

}
