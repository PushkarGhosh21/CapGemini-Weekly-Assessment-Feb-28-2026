package enums;

 enum Directions {
    NORTH,SOUTH,EAST,WEST,NORTHEAST,SOUTHEAST,NORTHWEST,SOUTHWEST
}

 public class Direction
 {
	 public static void main(String args[])
	 {
		 Directions d=Directions.WEST;
		 switch(d)
		 {
		 case NORTH:
			 System.out.println("Welcome to the North");
			 break;
		 case NORTHEAST:
			 System.out.println("Welcome to the North East");
			 break;
		 case NORTHWEST:
			 System.out.println("Welcome to the North West");
		 case SOUTHEAST:
			 System.out.println("Welcome to the South East");
			 break;
		 case SOUTHWEST:
			 System.out.println("Welcome to the South West");
			 break;
		 case SOUTH:
			 System.out.println("Welcome to the South");
			 break;
		 case EAST:
			 System.out.println("Welcome to the East");
			 break;
		 case WEST:
			 System.out.println("Welcome to the East");
			 break;
		default:
			System.out.println("INVALID!");
		 }
	 }
	}