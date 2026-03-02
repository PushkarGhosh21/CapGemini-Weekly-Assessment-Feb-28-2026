package variable_shadowing;
public class Shadow {
	int x=10;
	static int y=30;
	 void show() {
		 int x=20;  //shadows instance variable 
		 //No scene of duplication as both variables have different scope
		  int y=40;
	     System.out.println("x:");
		 System.out.println(x); //20
		 System.out.println(this.x);//10
		 
		 System.out.println("y:");
		 System.out.println(y);//40
		 System.out.println(this.y);//30
		 System.out.println(Shadow.y);//30
	 }
	public static void main(String args[])
	{new Shadow().show();
	}

}
