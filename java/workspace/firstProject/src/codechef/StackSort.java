package codechef;

import java.util.Stack;

public class StackSort {
	public static boolean ss(int arr[])
	{
		int n=arr.length;
		Stack<Integer>s=new Stack<>();
		int count=1;
		for(int x:arr)
			{
			s.push(x);
			while(!s.isEmpty() && s.peek()==count)
			{
				s.pop();
				count++;
			}
			}
		if(s.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
		
		
	public static void main(String[] args) {
		int arr[]= {1,2,4,3};
		System.out.println(ss(arr));

	}

}
