package clone_method;

public class Employee_Driver {

	public static void main(String[] args) throws Exception
	{
		Employee e1=new Employee(101);
		Employee e2=(Employee)e1.clone();
		System.out.println(e1+"    "+e2);
		
	}

}
