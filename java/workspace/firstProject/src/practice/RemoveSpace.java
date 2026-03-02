package practice;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="  This is a    Java program   .";
		String ns="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				ns=ns+s.charAt(i);
			}
		}
		System.out.println(ns);
	}

}
