package practice;

public class WordCount {

	public static void main(String[] args) {
		String s=" Hello World this is a Java Program  ";
		s=s.trim();
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ') {
				c++;
			}
		}
		c=c+1;
		System.out.println("Number of words:"+c);
		

	}

}
