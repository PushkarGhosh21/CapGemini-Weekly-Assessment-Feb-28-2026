package practice;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rounding 
{

	public static void main(String[] args) 
	{
		BigDecimal bd=new BigDecimal(10.389);
		BigDecimal ans=bd.setScale(2, RoundingMode.HALF_UP);
		System.out.println(ans);
	}

}
