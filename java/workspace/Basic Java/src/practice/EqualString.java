package practice;

public class EqualString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello  World";
		String ns="Hello  World";
		int l1=s.length();
		int l2=ns.length();
		if (l1!=l2)
			System.out.println("Not SAME String");
		else {
			int flag=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=ns.charAt(i))
			{
				flag=-1;
				break;
			}
		}
		if(flag==0)
		System.out.println("Equal");
		else
			System.out.println("Not Equal!");


	}
	}

}
