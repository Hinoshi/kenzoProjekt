package ausgewählteKlassen.Datum_Und_Uhrzeit;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DatumUhrzeit {

	 // wir wollen das Datum und die Uhrzeit festlegen 
	
	 public static void main(String[] args) {
		 
		  LocalDate heute =LocalDate.now();
		  
		  System.out.println( " heute : " +heute);
		  
		   TimeZone time = TimeZone.getTimeZone("Augsburg bayern") ; 
		   
		   GregorianCalendar cal = new GregorianCalendar ();
		    
		    LocalDate geburstag = LocalDate.of(1998, 3, 28);
		    
		     System.out.println( "geburstag : " + geburstag);
		     
		     LocalTime tagesschau = LocalTime.of(23, 0) ;
		     
		     System.out.println("Tagesschau : " + tagesschau);
		     
		     // Datum / Uhrzeit parsen
		     
		     DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy") ; 
		     
		     LocalDate da = LocalDate.parse("28/12/2006" , date) ; 
		     
		     System.out.println( "date : " +da);
		     
		    
	}
}
