package method_overloading;

public class Driver {

	public static void main(String[] args) {
		Parent p=new Parent();
		p.printNum(0);

		Child c=new Child();
		c.printNum(1);
		c.printNum(2, 3);
		
        
	}

}
