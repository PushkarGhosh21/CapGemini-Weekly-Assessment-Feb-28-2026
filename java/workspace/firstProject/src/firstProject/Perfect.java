package firstProject;

import java.util.Scanner;

public class Perfect {
     public static void main(String args[])
     {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter a number:");
    	 int n=sc.nextInt();
    	 percheck(n);
     }
     public static void percheck(int x)
     {
    	 int s=0;
    	 for(int i=1;i<=x/2;i++)
    	 {
    		 if((x%i)==0)
    			 s=s+i;
    	 }
    	 if(s==x)
    		 System.out.println(x+" is a Perfect Number")   ;
    	 else
    		 System.out.println(x+" is not a perfect number");
    	 }
}
