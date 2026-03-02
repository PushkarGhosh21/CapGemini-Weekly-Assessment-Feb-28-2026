package firstProject;

public class DMS {

	public static void main(String[] args) {
		char ch=';';
		if(Character.isUpperCase(ch))
			System.out.println("UpperCase");
		else if(Character.isLowerCase(ch))
			System.out.println("LowerCase");
		else if(!Character.isLetterOrDigit(ch))
			System.out.println("Special Character");
		else
			System.out.println("Number");
		
	}

}
