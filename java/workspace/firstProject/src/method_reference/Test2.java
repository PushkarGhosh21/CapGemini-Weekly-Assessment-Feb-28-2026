package method_reference;

@FunctionalInterface
interface Tdemo
{
	void show(String s);
}
public class Test2 {

	public void show(String s)
	{
		s=s.toUpperCase();
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		
       Test2 t=new Test2();
       //Lamda Expression
       Tdemo d=(String s)->t.show(s);
       d.show("hello world!");
       //Method referencing using Object
       Tdemo d2=t::show;
       d2.show("java is a programming language");
       
	}

}
