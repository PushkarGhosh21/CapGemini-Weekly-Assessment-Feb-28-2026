package method_overriding_overloading;

import method_overriding.Employee;
import method_overriding.It;
import method_overriding.Supporting;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		It i =new It();
		Supporting s=new Supporting();
		System.out.println("Generic Employee:"+e.monthlySalCal());
		System.out.println("IT Employee:"+i.monthlySalCal());
		System.out.println("Supporting employee:"+s.monthlySalCal());

	}

}
