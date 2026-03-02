package test1;

public class Solution {
	
	public static int defected(char arr[])
	{
		int ans=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='F')
			{
				ans=i;
				break;
			}
		}
		return ans;
	}

	public static void main(String args[])
	{
		char ch[]= {'P','P','P','P','F','F'};
		System.out.println(defected(ch));
	}
}
