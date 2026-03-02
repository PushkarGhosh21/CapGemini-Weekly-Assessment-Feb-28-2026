package wrapper;

public class Demo {

	public static void main(String[] args) {
		byte b=7;
		//wrapping(auto boxing)
		Byte b1=b;
		System.out.println("Auto boxed:"+b1.getClass());
		//Unwrapping(Unboxing)
		byte b2=b1;
		System.out.println("Unboxed:"+b2);
		//Parsing
		String bStr="7";
		System.out.println("Type:"+bStr.getClass());
		//Parsing Using Constructor
		Byte b3=new Byte(bStr);
		System.out.println("b3:"+b3);
		System.out.println("Type:"+b3.getClass());
		//Parsing Using Parse Method()
		Byte b4=Byte.parseByte(bStr);
		System.out.println("b4:"+b4);
		System.out.println("Type:"+b4.getClass());
		
		
	}
}
