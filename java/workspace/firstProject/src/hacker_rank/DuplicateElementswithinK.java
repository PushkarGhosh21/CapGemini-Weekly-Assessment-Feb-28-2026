package hacker_rank;

import java.util.HashSet;

public class DuplicateElementswithinK {
	public static boolean Check(int arr[],int k)
	{
		HashSet<Integer>ans=new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			if(ans.contains(arr[i])) {
				return true;
			}
			ans.add(arr[i]);
			if(ans.size()>k)
			{
				ans.remove(arr[i-k]);
			}
		}
		return false;
	}
	public static void main(String args[])
	{
		int a[]= {1,2,3,1,7,9,0};
		int k=3;
		System.out.println(Check(a,k));
	}

}
