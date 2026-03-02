package hacker_rank;

public class BinarySearch {
	
	public static int Bs(int []arr,int tar)
	{
		int result=-1;
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==tar)
			{
				result=mid;
				high=mid-1;
			}
			else if(tar<=arr[mid])
			{
				high=mid-1;
			} 
			else
			{
				low=mid+1;
			}
		}
		return result;
	
	}

	public static void main(String[] args) {
		int a[]= {-9,1,18,18,90,100,100};
		int tar=18;
		System.out.println(Bs(a,tar));

	}

}
