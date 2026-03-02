package firstProject;

		public class BhelofStaticNonStatic {
			public BhelofStaticNonStatic() {
				System.out.println("Constructor");
			}
			int i= 7;
			{
				System.out.println("Non static block");
			}	
			public static void main(String[] args) {
				System.out.println("Main Method");
				//Create objects to invoke non static method
				Object objectClass = new BhelofStaticNonStatic();		
			}
			static {
				System.out.println("First Static");
			}
			static int j = printer();
			static {
				System.out.println("Second Static");
			}
			public static int printer() {
				System.out.println("Printer");
				return 0;
			}
		}

	


