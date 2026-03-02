package advanced_java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedFile {

	public static void main(String[] args) throws IOException {

 	   File f = new File("C:\\Users\\Pushkar Ghosh\\Desktop\\Capgemini Program\\FileHandling\\test1.txt");
 	   FileReader fr=new FileReader(f);
 	   BufferedReader br=new BufferedReader(fr);
        String s1="";
        String s2="";
        while((s1=br.readLine())!=null)
        {
     	   s2=s2+s1;
        }
        System.out.println(s2);
	}

}
