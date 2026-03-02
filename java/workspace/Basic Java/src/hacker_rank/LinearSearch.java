package hacker_rank;

public class LinearSearch {

	public static int LS(int a[],int val)
	{
		int res=-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==val)
			{
				res=i;
				break;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int arr[]= {-9,18,2,45,-6,999};
		int tar=18;
		System.out.println(LS(arr,tar));

	}

}
