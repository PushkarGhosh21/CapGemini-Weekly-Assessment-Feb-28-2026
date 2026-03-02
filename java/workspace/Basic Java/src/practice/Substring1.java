package practice;

public class Substring1 {

	public static void main(String[] args) {
		String s="ABC";
		int val=133;
		int ans=-1;
		for(int i=0;i<s.length();i++)
		{
			int sum=0;
			for(int j=i;j<s.length();j++)
			{
				sum=sum+s.charAt(j);
				if (sum==val)
				{ans=i;
				break;}
				if(sum>val) {
					break;
				}
				if(sum==val) {
					break;
				}
				if(ans!=-1) {
					break;
				}
			}	
				 
		}
		System.out.println(ans);	
	}

}
