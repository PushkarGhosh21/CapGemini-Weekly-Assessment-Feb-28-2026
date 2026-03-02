package non_primitive_example;

import java.util.Scanner;

public class Driver {

	
		// TODO Auto-generated method stub
	static	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Car car=new Car();//Creating object of car
		System.out.println("Which engine to fit?");
		System.out.println("1.Petrol Engine");
		System.out.println("2.Diesel Engine");
		System.out.println("Enter your choice:");
		byte uc=sc.nextByte();
		sc.nextLine();
		Engine engine=null;
		switch(uc)
		{
		case 1: PetrolEngine petrolengine=new PetrolEngine();
		engine=petrolengine;
		break;
		
		case 2: DieselEngine dieselengine=new DieselEngine();
		engine=dieselengine;
		break;
		default:
			PetrolEngine petrolengine1=new PetrolEngine();
			engine=petrolengine1;
			break;
		}
		car.engine=engine;//Fitting the engine into the car
		
		switch(uc)
		{
		case 1: PetrolEngine petrolengine=(PetrolEngine)engine;//Down casting using cast operator 
		petrolengine.startEngine();
		break;
		
		case 2: DieselEngine dieselengine=(DieselEngine)engine;
		dieselengine.startEngine();
		break;
		default:
			PetrolEngine petrolengine1=(PetrolEngine)engine;
			petrolengine1.startEngine();
			break;
			
		}
	}
	
		
	

}
