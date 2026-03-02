package enums;
public class OrderStatus
{
	
     public enum Status {
            PLACED,PENDING,APPROVED,DELIVERED,CANCELLED
     }
     public static void main(String args[])
     {
    	     Status status=Status.APPROVED;
    	     System.out.println(status);
    	     
     }
}