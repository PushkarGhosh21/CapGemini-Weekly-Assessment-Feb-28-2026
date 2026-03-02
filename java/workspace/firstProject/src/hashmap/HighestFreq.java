package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class HighestFreq {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();		
		}
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int num:arr)
		{
			map.put(num, map.getOrDefault(num,0)+1);
		}
		int max=0;
		int ans=0;
		for(int mk:map.keySet())
		{
			if(map.get(mk)>max)
				{max=map.get(mk);
				ans=mk;
				}
		}
		System.out.println(max+" "+ans);

	}

}
