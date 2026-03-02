package codechef;

import java.util.Scanner;
import java.util.Stack;

public class RPN {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String str=sc.nextLine();
		Stack<Character>s=new Stack<>();
		for(int i=0;i<str.length();i++)
		{
            char c=str.charAt(i);
            if(c=='('||c=='+'||c=='-'||c=='*'||c=='/'||c=='^')
            {
            	s.push(c);
            }
            else if(c==')')
            {
            	while(!s.isEmpty() && s.peek()!='(')
            	{
            		System.out.print(s.pop());
            	}
            	s.pop();
            }
            else
            {
            	System.out.print(c);
            }
	    }
		while(!s.isEmpty())
		{
			if(s.peek()!='(') {
				System.out.print(s.pop());
			} else {
				s.pop();
			}
		}
		

}
}