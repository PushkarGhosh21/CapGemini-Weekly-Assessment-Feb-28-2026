package clone_method;

public class Employee implements Cloneable{
	int id;

   Employee(int id)//Constructor
   {
	   this.id=id;
   }
   @Override
   protected Object clone()throws CloneNotSupportedException
   {
	   return super.clone();
   }
}
