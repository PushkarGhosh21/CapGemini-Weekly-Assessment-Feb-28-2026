package practice;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,10,23,-9,54};
		int l=a.length;
		int arr[]=new int[l];
		for(int i=0;i<l;i++)
		{
			arr[i]=a[i];
		}
		System.out.println("Copy array:");
		for(int i=0;i<l;i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
