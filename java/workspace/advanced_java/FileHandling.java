package advanced_java;

import java.io.File;
import java.io.IOException;

public class FileHandling 
{
	public static void main(String args[]) throws IOException
	
	{
		File f=new File("C:\\Users\\Pushkar Ghosh\\Desktop\\Capgemini Program\\FileHandling//test.txt");
		// Creates a new file called test.txt in the memory location
	    //C:\\Users\\Pushkar Ghosh\\Desktop\\Capgemini Program\\FileHandling
		System.out.println(f.createNewFile());
		//Deleting the existing file
		System.out.println(f.delete());
		//Checking if the file exists or not
		//
		if(f.exists()==false)
		{
			File f1=new File("C:\\Users\\Pushkar Ghosh\\Desktop\\Capgemini Program\\FileHandling//test.txt");
			
			System.out.println(f1.createNewFile());
		} else 
		{
			System.out.println("File already exists");
		}
			
	}
}
