package practice;

public class Tolowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="HELLO WORLD";
		String ns="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>=65 && ch<=90)
			{
				ch=(char)(ch+32);
				ns=ns+ch;
				
			} else {
				ns=ns+" ";
			}
		}
		System.out.println(ns);
	}

}
