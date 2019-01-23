package assignmentday3;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class RepeatCalender {

	

		public static void main(String[] args) {
			
		String[] Week = {"Sun","Mon","Tues","Wed","Thus", "Fri","Sat"};
		int interval = 0;
		LocalDate d=LocalDate.of(2000,01,01);
		int numOfDays=d.lengthOfYear();
		DayOfWeek day=d.getDayOfWeek();
		
				
		for(int year=2001;year<2100;year++){
			LocalDate date=LocalDate.of(year,01,01);
			int numDays=date.lengthOfYear();
			DayOfWeek days=date.getDayOfWeek();
			//System.out.print(day+"   ");
			//System.out.println(days);
			interval++;
			if(day.compareTo(days)==0){
				if(numDays == numOfDays)
				{
					System.out.println(interval);
					interval = 0;
				}		
			}
		}
	}
}
	

	
	

