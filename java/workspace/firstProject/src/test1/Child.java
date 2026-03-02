package test1;

public class Child extends Parent {

	protected int j=20;
	protected int print()
	{
		return j;
	}
	public static void main(String [] args)
	{
		Parent p=new Parent();
		System.out.println(p.print());
		Child c =new Child();
		System.out.println(c.print());
	}
}
