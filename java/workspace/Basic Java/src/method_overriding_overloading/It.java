package method_overriding_overloading;

public class It extends Employee {

	double varpay=200000;
	//
    public double SalCal(byte dm,float bonus)
	{
		return(((basepay+varpay)/12*dm)+bonus);
	}
}
