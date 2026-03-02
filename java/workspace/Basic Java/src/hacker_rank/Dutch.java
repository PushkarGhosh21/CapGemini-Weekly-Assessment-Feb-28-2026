package hacker_rank;


public class Dutch {
	
	public static void sort(int arr[])
	{
		int low=0,mid=0;
		int high=arr.length-1;
		while(mid<high)
		{
			if(arr[mid]==0)
			{
				swap(arr,low,mid);
				low++;
				mid++;
			}
			else if(arr[mid]==1) {
				mid++;
			} else
			{
				swap(arr,mid,high);
				high--;
			}
		}
	}
	public static void swap(int arr[],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void main(String args[])
	{
		int arr[]= {0,1,2,2,1,0,0,1,2,0,0,2,2,1,1,1};
		sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
