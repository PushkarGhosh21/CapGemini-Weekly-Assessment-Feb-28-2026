package stack;

import java.util.Stack;

public class PostFix {
	
	public static int postfixsum(String exp)
	{
		int sum=0;
		Stack<Integer>ans=new Stack<>();
		
		for(int i=0;i<exp.length();i++) //From left to right
		{
			char ch=exp.charAt(i);
			if(Character.isDigit(ch))
			{
				ans.push(ch-'0');
			}
			else if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
			{
				int a=ans.pop();
				int b=ans.pop();
				
				  switch (ch) {
                  case '+': ans.push(a + b); break;
                  case '-': ans.push(b-a); break;
                  case '*': ans.push(a * b); break;
                  case '/': ans.push(b/a); break;
              }
			}
		}
		   return ans.pop();
	}
	

	public static void main(String[] args) {
		  String postfix = "512+4*+3-";
	        System.out.println(postfixsum(postfix));

	}

}
