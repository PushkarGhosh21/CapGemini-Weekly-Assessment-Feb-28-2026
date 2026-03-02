package advanced_java;

import java.util.Scanner;
	class C1 extends Thread
	{
		@Override
		public void run()
		{
			System.out.println("Program Started:");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter num1:");
	        int num1=sc.nextInt();
	        System.out.println("Enter num2:");
	        int num2=sc.nextInt();
	        System.out.println(num1+num2);
	        System.out.println("Program End");
		}
        
	}
	
	class C2 extends Thread
	{
		@Override
		public void run()
		{
			System.out.println("Printing Characters:");
	        for(int i=65;i<=75;i++)
	        {
	        	System.out.println((char)i);
	        
	        try
	        {
	        	Thread.sleep(3000);
	        }
	        catch(InterruptedException e)
	        {
	        	e.printStackTrace();
	        }
	        }		}
        
	}
	
	class C3 extends Thread
	{
		@Override
		public void run()
		{
			System.out.println("Printing Numbers:");
		      for(int i=65;i<=75;i++)
		      {
		      	System.out.println(i);
		      
		      try
		      {
		      	Thread.sleep(3000);
		      }
		      catch(InterruptedException e)
		      {
		      	e.printStackTrace();
		      }
		      }	}}
        
	public class MultiThreading 
		{
	  
	public static void main(String[] args) 
	{  C1 t1=new C1();
        C2 t2=new C2();
        C3 t3=new C3();
         t1.start();
         t2.start();
         t3.start(); 
	}

}
