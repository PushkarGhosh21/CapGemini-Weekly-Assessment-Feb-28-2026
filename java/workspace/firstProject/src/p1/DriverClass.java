package p1;

public class DriverClass {

	public static void main(String[] args) {
		Engine e=new Engine();
		System.out.println(e.noOfCyl);
		Car c=new Car();
		System.out.println(c.col);// Car has access to its own members
		System.out.println(c.engine.noOfCyl);//Car has access to Engine's methods also


	}

}
