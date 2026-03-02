package firstProject;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=userInput.nextInt();
		fact(n);
	}
	public static void fact(int x)
	{
		System.out.println("The factors are:");
		List<Integer> ans=new ArrayList<>();
		for(int i=1;i<=x;i++)
		{
			if((x%i)==0)
				ans.add(i);
		}
		for(int j:ans)
			System.out.print(j+" ");
	}

}
