package advanced_java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileHandling2 {

	public static void main(String[] args) throws IOException 
	{
		
		File f=new File("C:\\Users\\Pushkar Ghosh\\Desktop\\Capgemini Program\\FileHandling//test1.txt");
		//Creating the new file
		//System.out.println(f.createNewFile());
		
		FileInputStream fis=new FileInputStream(f);
		//System.out.println(fis.read());// Will return -1 when file is empty
		//Even if the file contains text it will only return the ascii value of the 1st letter only
		
		//If we want to print the entire content we follow the following steps
		int count;
		while((count=fis.read())!=-1)
		{
			System.out.print((char)count);//Just printing count would return ascii values of the characters so convert to char
		}
		
	}

}
