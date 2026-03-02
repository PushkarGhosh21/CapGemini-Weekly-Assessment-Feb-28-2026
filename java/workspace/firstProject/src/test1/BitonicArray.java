package test1;

public class BitonicArray {

	public static int Bitonic(int arr[])
	{
		int low=0;
		int high=arr.length-1;
		while(low<high)
		{
			int mid=low+(high-low)/2;
			if(arr[mid]<arr[mid+1])
			{
				low=mid+1;
			} else {
				high=mid;
			}
		}
		return arr[low];
	}
	public static void main(String[] args) {
		int a[]= {7,10,18,9,6,5};
		System.out.println(Bitonic(a));
	}

}
