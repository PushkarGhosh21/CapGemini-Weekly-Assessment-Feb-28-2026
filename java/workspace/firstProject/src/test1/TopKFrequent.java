package test1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequent {

	public static int[] topK(int arr[],int k)
	{
		HashMap<Integer,Integer>h=new HashMap<>();
		for(int n:arr)
		{
			h.put(n,h.getOrDefault(n, 0)+1);
		}
		
		PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->h.get(b)-h.get(a));
		pq.addAll(h.keySet());
		
		int ans[]=new int[k];
		for(int i=0;i<k;i++)
		{
			ans[i]=pq.poll();
		}
		return ans;
		
	}
	public static void main(String[] args) {
		int nums[]= {1,2,1,2,1,2,3,1,3,2};
		int k=2;
		 System.out.println(Arrays.toString(topK(nums, k)));

	}

}
