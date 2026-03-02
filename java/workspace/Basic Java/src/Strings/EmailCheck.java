package Strings;

public class EmailCheck {
     static String email="pg.2022.2026@gmail.com";
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		 if(isEmailValid(email))
			 System.out.println("Valid");
		 else
			 System.out.println("INVALID!");

	}
	 public static boolean isEmailValid(String email)
	 {
		 if(!email.contains("@"))
			 return false;
		 
		 return true;
	 }

}
