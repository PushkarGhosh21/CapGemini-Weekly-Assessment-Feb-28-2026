package practice;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello World!";
		String ns="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			ns=ch+ns;
		}
		System.out.println("Reverse of "+s+" is:"+ns);

	}

}
