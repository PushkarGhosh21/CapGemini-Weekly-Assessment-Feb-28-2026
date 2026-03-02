package wrapper;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="-1";
		byte pb1=Byte.parseByte(s1);
		System.out.println("Byte:"+pb1);
		String s2="+1";
		byte pb2=Byte.parseByte(s2);
		System.out.println("Byte:"+pb2);
		String s3="1";
		byte pb3=Byte.parseByte(s3);
		System.out.println("Byte:"+pb3);
		String s4="-0";
		byte pb4=Byte.parseByte(s4);
		System.out.println("Byte:"+pb4);
		String s5="+0";
		byte pb5=Byte.parseByte(s5);
		System.out.println("Byte:"+pb5);
		String s6="0";
		byte pb6=Byte.parseByte(s6);
		System.out.println("Byte:"+pb6);
		String s7="1+";
		byte pb7=Byte.parseByte(s7);
		System.out.println("Byte:"+pb7);
		String s8="1-";
		byte pb8=Byte.parseByte(s8);
		System.out.println("Byte:"+pb8);
		String s9="++";
		byte pb9=Byte.parseByte(s9);
		System.out.println("Byte:"+pb9);
		String s10="--";
		byte pb10=Byte.parseByte(s10);
		System.out.println("Byte:"+pb10);
		String s11="a";
		byte pb11=Byte.parseByte(s11);
		System.out.println("Byte:"+pb11);
		String s12="a0";
		byte pb12=Byte.parseByte(s12);
		System.out.println("Byte:"+pb12);
		String s13="a9";
		byte pb13=Byte.parseByte(s13);
		System.out.println("Byte:"+pb13);
		String s14="!";
		byte pb14=Byte.parseByte(s14);
		System.out.println("Byte:"+pb14);
		

	}

}
