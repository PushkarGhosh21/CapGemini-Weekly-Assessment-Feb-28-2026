package Strings;

public class S1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Anirban");
		System.out.println(System.identityHashCode(s1));
		s1="Pushkar";
		System.out.println(System.identityHashCode(s1));
		
	}

}
