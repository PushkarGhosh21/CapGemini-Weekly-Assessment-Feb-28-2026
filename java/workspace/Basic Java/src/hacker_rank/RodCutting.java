package hacker_rank;

public class RodCutting
{

	public static int MaxProfit(int price[])
	{
		int n=price.length;
		int dp[]=new int[n+1];
		dp[0]=0;
		for(int i=1;i<=n;i++) 
		{
			int ans=Integer.MIN_VALUE;
			for(int j=0;j<i;j++)
			{
				ans=Math.max(ans, price[j]+dp[i-j-1]);
			}
			dp[i]=ans;
		}
		
		return dp[n];
	}
	
	public static void main(String[] args) 
	{
		int arr[]= {12,45,60,99,100};
		System.out.println(MaxProfit(arr));

	}

}
