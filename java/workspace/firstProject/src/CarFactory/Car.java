package CarFactory;

public class Car {


static Engine engine;
public static void main(String args[])
{
       PetrolEngine PE=new PetrolEngine();
       engine=PE;
       System.out.println(engine.getClass());
       DieselEngine DE=new DieselEngine();
       engine=DE;
       System.out.println(engine.getClass());

}

}