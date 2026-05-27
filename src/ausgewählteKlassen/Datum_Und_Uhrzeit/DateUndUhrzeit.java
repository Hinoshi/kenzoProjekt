package ausgewählteKlassen.Datum_Und_Uhrzeit;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateUndUhrzeit {

	
	public static void main(String[] args) {
		
		
		Date date = new Date(2) ;
		
//		System.out.print(date.setTime(12));
		
		System.out.println( date);
		
		System.out.println(date.getTime());
		
		System.out.println(date.toString());

		System.out.println();
		
		 // simpleDateformat 
		
		SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");
		
		
		 String s = simple.format(date);
		 
		 System.out.println(s);
		 
		  // Timezone 
		 
		 
		 TimeZone time =  TimeZone.getTimeZone("Bayern/Augsburg") ; 
		 
		 
		 System.out.println(TimeZone.getTimeZone(s));
		 
		 System.out.println( time.getID());
		 
		 // dioe Klasse GregorianCalendar
		 
		 GregorianCalendar calendar = new GregorianCalendar(2020, 11, 3) ;
		 
		 GregorianCalendar callen  = new GregorianCalendar(time);
		 
		 
		 callen.setTime(date) ; 
		 
		 
		 System.out.println(calendar);
		 
		 
		 GregorianCalendar cal = new GregorianCalendar(time);
		 
		 System.out.println(cal);
		 
		  
		  
		  System.out.println( "wir sind im Jahr : " + cal.get(Calendar.YEAR));
		  
//		   System.out.println(" Hier ist der : "  +cal.set(Calendar.YEAR, 2010));
		  
		  
		 
		 
	}
	
}
