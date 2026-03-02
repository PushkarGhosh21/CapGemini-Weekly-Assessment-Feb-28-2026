package method_overriding;

public class It extends Employee{
	double varpay=200000;
	//
    @Override
    public double monthlySalCal()
	{
		return (basepay+varpay)/12;
	}

}
