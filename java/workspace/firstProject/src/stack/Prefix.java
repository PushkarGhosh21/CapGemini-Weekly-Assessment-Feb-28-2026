package stack;

import java.util.Stack;

public class Prefix {
	
	public static int prefixsum(String exp)
	{
		int sum=0;
		Stack<Integer>ans=new Stack<>();
		
		for(int i=exp.length()-1;i>=0;i--) //From right to left
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
                  case '-': ans.push(a - b); break;
                  case '*': ans.push(a * b); break;
                  case '/': ans.push(a / b); break;
              }
			}
		}
		   return ans.pop();
	}
	

	public static void main(String[] args) {
		  String prefix = "-+9*234";
	        System.out.println(prefixsum(prefix));

	}

}
