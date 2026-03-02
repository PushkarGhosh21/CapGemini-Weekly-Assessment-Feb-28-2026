package advanced_java;

import java.util.Scanner;

class C01 implements Runnable
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
class C02 implements Runnable
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
class C03 implements Runnable
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
public class MultiThreading2 {

	public static void main(String[] args) 
	{
		C01 t1=new C01();
		C02 t2=new C02();
		C03 t3=new C03();
		
		Thread td1=new Thread(t1);
		Thread td2=new Thread(t2);
		Thread td3=new Thread(t3);
		
		td1.start();
		td2.start();
		td3.start();
		

	}

}
