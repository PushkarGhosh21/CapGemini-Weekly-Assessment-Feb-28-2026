package method_overriding;
import java.util.Scanner;
public class Child extends Parent{
    @Override //Purely Informative for developer
              //No change in output but highly recommended 
              //to  use during overriding
	public void printStar()
    {
		System.out.println("Enter * count:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		sc.close();
		for(int i=0;i<n;i++)
        System.out.println("*");
    }
    }
