package variable_hiding;

public class Driver {

	public static void main(String[] args) {
	Parent p=new Child();//Up casting
	Child c=new Child();
	System.out.println(p.x);
	System.out.println(c.x);

	}

}
