package hashcode;

public class Driver {
            
	public static void main(String args[])
	{
		PetAnimal obj=new PetAnimal("Labrador",1);
		System.out.println(obj);
		System.out.println(obj.hashCode());
		
	}
}
