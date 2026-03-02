package enums;
import java.util.Scanner;
public class Corporate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Employee e=new Employee();
		System.out.println("Enter name:");
		String s=sc.nextLine();
		e.name=s;
		System.out.println("Enter age:");
		int a=sc.nextInt();
		e.age=a;
		System.out.println("Enter salary:");
		double sal=sc.nextDouble();
		e.salary=sal;
		if(sal<300000)
			System.out.println(e.role.INTERN);
		else if(sal>=300000 && sal<=550000)
			System.out.println(e.role.ANALYST);
		else if(sal>550000 && sal<=750000)
			System.out.println(Roles.SENIOR_ANALYST);
		else if(sal>750000 && sal<=1000000)
			System.out.println(Roles.MANAGER);
		else
			System.out.println(Roles.GENERAL_MANAGER);	}}
