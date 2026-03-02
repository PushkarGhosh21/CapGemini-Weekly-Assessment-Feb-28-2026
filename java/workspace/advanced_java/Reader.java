package advanced_java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Pushkar Ghosh\\Desktop\\Capgemini Program\\FileHandling//test1.txt");
        System.out.println(f.exists());
//        if(f.exists()) {
//            System.out.println(f.delete());
//        }
        
        if(! f.exists()) {
            System.out.println(f.createNewFile());
        }
        
        FileInputStream fls = new FileInputStream(f);
        
        int ch;
        while ((ch = fls.read()) != -1) {
            System.out.print((char)ch);
        }
        fls.close();
    }
}