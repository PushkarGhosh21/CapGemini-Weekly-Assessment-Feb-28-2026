package method_overriding;

public class Supporting extends Employee{
	double varpay=100000;
	//
	@Override
    public double monthlySalCal()
	{
		return (basepay+varpay)/12;
	}

}
