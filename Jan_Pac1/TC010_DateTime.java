package Jan_Pac1;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class TC010_DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Instant currenttime=Instant.now();
    System.out.println("Current Time:"+currenttime);
    
    LocalDate date1=LocalDate.now();
    System.out.println("Current date:"+date1);
    
    LocalDate ind=LocalDate.of(1947, Month.AUGUST, 15);
    System.out.println("Independece Day:"+ind);
    
    System.out.println("Tomorrow:"+date1.plusDays(1));
    System.out.println("Last Month:"+date1.minusMonths(1));
    
    ZonedDateTime ct=ZonedDateTime.now();
   
    ZonedDateTime ctparis=ZonedDateTime.now(ZoneId.of("Europe/Paris"));
	System.out.println("Indian Time:"+ct);
	System.out.println("paris current time:"+ctparis);
	
	Period p1=date1.until(ind);
	System.out.println("period:"+p1);
	System.out.println("Days:"+p1.get(ChronoUnit.DAYS));
	System.out.println("Months:"+p1.get(ChronoUnit.MONTHS));
	System.out.println("Years:"+p1.get(ChronoUnit.YEARS));

	
	
	}

}
