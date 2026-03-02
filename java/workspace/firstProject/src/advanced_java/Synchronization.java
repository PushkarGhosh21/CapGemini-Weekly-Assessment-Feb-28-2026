package advanced_java;

class Demo implements Runnable
{

	int count=0;
	
	synchronized public void show() //To prevent race condition we use synchronized keyword
	
	{
		count++;
	}
	@Override
	public void run()
	{
		for(int i=0;i<500;i++)
		{
			show();
		}
		
	}
}
public class Synchronization 
{

	public static void main(String args[])
	{
		Demo d=new Demo();
		Thread t1=new Thread(d);
		Thread t2=new Thread(d);
		t1.start();
		t2.start();
		//System.out.println(d.count);
		try 
		{
			t1.join();
			t2.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(d.count);
		
	}
}
