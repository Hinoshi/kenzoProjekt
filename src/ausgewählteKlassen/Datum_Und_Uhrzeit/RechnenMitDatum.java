package ausgewählteKlassen.Datum_Und_Uhrzeit;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class RechnenMitDatum {

	
	 public static void main(String[] args) {
		
		 
		 //wir wollen mit datum rechnen 
		 
		 
		 
		 LocalDate heute = LocalDate.now();
	        LocalDate date = heute.plus(7, ChronoUnit.DAYS);

	        System.out.println("Heute: " + heute);
	        System.out.println("In 7 Tagen: " + date);
	}
}
