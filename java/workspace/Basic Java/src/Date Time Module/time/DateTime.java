package date.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTime {

	public static void main(String[] args) {
		
		LocalDate today=LocalDate.now();
		System.out.println(today);
		LocalDate future=today.plusDays(15);
		System.out.println(future);
		
		if(future.isAfter(today))
		{
			System.out.println("Future Date is valid.");
		}
        
		Period period=Period.between(today, future);
		System.out.println("Gap between "+today+" and "+future+" is:"+period.getDays());
		
		LocalDateTime currentTimeSTamp=LocalDateTime.now();
		System.out.println(currentTimeSTamp);
		
		DateTimeFormatter dateFormatter=DateTimeFormatter.ofPattern("DD-MM-yyyy");
		System.out.println(today.format(dateFormatter));
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
		System.out.println(currentTimeSTamp.format(dateTimeFormatter));
	}

}
