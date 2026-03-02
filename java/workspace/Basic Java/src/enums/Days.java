package enums;

enum Day {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}

public class Days{
    
    public static void main(String[] args){
        
       for(Day d:Day.values())
       {
    	   System.out.println(d);
       }
    }
}