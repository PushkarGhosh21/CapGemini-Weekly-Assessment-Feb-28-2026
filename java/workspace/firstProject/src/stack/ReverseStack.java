package stack;

import java.util.Stack;

public class ReverseStack {

	public static void rev(Stack<Integer>a)
	{
		Stack<Integer>r=new Stack<>();
		while(!a.isEmpty())
		{
			r.push(a.pop());
		}
		a.addAll(0, r);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>ans=new Stack<>();
		ans.push(1);
		ans.push(2);
		ans.push(3);
		ans.push(4);
		ans.push(5);
		System.out.println("Before Reversal");
        Stack<Integer> temp = (Stack<Integer>) ans.clone();
        while (!temp.isEmpty()) {
            System.out.println(temp.pop());
           
        }
		System.out.println("After Reversal");
		rev(ans);
		 while(!ans.isEmpty())
		 {
			 System.out.println(ans.peek());
			 ans.pop();
		 }
		

	}

}
