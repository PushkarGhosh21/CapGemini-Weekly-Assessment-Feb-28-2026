package test;

public class Sum2D {

	public static void main(String[] args) {
		
		int arr[][]= {{0,1,2},{3,4,5},{6,7,8}};
		int s=0;
		System.out.println("The matrix:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
			    System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				s=s+arr[i][j];
			}
		}
		System.out.println("Sum of the given array:"+s);

	}

}
