package hacker_rank;
import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;

public class RemoveKthLargest {
	public static int rem(int []arr,int k)
	{
		//HashSet is used to tackle duplicate values
		HashSet<Integer>h=new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			h.add(arr[i]);
		}
	
		PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder()); //Just Changing Min Heap to Max Heap
		for(int x:h) {
			pq.add(x);
		}
		
		int ans=-9999;
		for(int i=1;i<=k;i++)
		{
			ans=pq.poll();
		}
		return ans;
		}
	public static void main(String[] args) {
		int arr[]= {-9,-1,23,68,178,900,-9};
		int k=3;
		System.out.println(rem(arr,k));

	}

}
