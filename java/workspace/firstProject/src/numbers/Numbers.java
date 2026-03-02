package numbers;

import java.math.BigDecimal;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=0.1;
		double b=0.2;
		System.out.println(a+b);
		
		BigDecimal bd1=new BigDecimal("0.1");
		BigDecimal bd2=new BigDecimal("0.2");
		System.out.println(bd1.add(bd2));

	}

}
