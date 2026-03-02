package method_overriding_overloading;

public class Supporting extends Employee {

	double varpay=100000;
	//
	public double SalCal(byte dm,float bonus)
		{
			return(((basepay+varpay)/12*dm)+bonus);
		}

}
