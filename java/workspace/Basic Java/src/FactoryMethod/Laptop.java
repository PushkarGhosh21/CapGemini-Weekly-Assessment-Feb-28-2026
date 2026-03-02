package Factory;

public class Laptop {
	
	     private static Laptop laptop;
	     private Laptop() // Singleton class so a private constructor
	     {}
           public static Laptop laptopFactory()
                    {
        	            if(laptop==null) {
        	            	System.out.println("Laptop object created");
        	             laptop=new Laptop();
        	             }
        	            else {
        	            	System.out.println("Previously created laptop object");
        	            }
						return laptop;
                    	
                    }
}
