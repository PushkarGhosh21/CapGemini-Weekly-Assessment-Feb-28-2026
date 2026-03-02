package method_overriding;

public class Driver_Salary {

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
