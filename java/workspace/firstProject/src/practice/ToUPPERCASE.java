package practice;

public class ToUPPERCASE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="hello world java is fun.";
		String ns="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>=97 && ch<=122)
			{
				ch=(char)(ch-32);
				ns=ns+ch;
				
			} else {
				ns=ns+" ";
			}
		}
		System.out.println(ns);
	}

}
