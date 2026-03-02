package method_reference;
import java.util.function.BiFunction;
import java.util.function.Function;
public class Test1 {
         public static void main(String[] args) {
		//Using Lamda Function
		Function<Integer,Double>f=(n)->Math.sqrt(n);//Function<> is an example of functional interface where Integer 
		System.out.println(f.apply(4));             //is the type of input value and Double is data type of the output
		
		//Using Method referencing
		Function<Integer,Double>f2= Math::sqrt; //Static Method referencing
		System.out.println(f2.apply(16));
		
		//In the above 2 cases we are using in built static methods
		//Below we are using user built in built method
		//We are using BiFunction(Functional Interface) as it accepts 2 arguments
		//This was method referencing
		BiFunction<Double,Double,Double>f3=Test1::Multiply;//(User defined)Static Method referencing
		System.out.println(f3.apply(2.0,3.0));
		//Using Lamda Function
		BiFunction<Double,Double,Double>f4=(a,b)->Test1.Multiply(a,b);
		System.out.println(f4.apply(4.0, 2.0));
	}
	public static double Multiply(double a,double b)
	{
		return (a*b);
	}
}
