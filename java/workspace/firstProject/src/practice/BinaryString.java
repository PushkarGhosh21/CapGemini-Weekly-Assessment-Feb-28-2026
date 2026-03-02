package practice;

public class BinaryString {

	public static void main(String[] args) {
		String s="1010101000010010";
		int flag=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!='1' && ch!='0')
				flag=1;
		}
		if(flag==0)
			System.out.println("Binary String");
		else
			System.out.println("Not Binary String");

	}

}
