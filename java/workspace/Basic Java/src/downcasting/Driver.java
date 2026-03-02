package downcasting;


public class Driver {
            public static void main(String [] args)
            {
            	 System.out.println("START");
            	 //For generalization(upcasting)
            	 Child c=new Child();
            	 Parent upcasted=c;
            	 //For specification(downcasting)
            	 Child downcasted=(Child)upcasted;
            	 System.out.println("END");
            }}
