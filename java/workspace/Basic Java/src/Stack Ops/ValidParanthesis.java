package stack;

import java.util.Stack;

public class ValidParanthesis {
    public static boolean isBalanced(String s) {
       
    	int l=s.length();
        if(l<=1) {
			return false;
		}
        Stack<Character>ans=new Stack<Character>();
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[') {
				ans.push(s.charAt(i));
			} else if(ans.empty()) {
				return false;
			} else
            {
                if(s.charAt(i)==')')
                {
                    if(ans.pop()!='(') {
						return false;
					}
                }
                if(s.charAt(i)=='}')
                {
                    if(ans.pop()!='{') {
						return false;
					}
                }
                if(s.charAt(i)==']')
                {
                    if(ans.pop()!='[') {
						return false;
					}
                }
            }
             
        }
        if(ans.empty()) {
			return true;
		} else {
			return false;
		}
    }

    public static void main(String[] args) {
        String s = "[()()]{}";
        System.out.println((isBalanced(s)));
    }
}