package internationalisierung.locale;

import java.util.Arrays;
import java.util.Locale;

public class KlasseLocale {

	 public static void main(String[] args) {
		
		 Locale  loc = Locale.of( "en","US") ; 
		 
		 System.out.println(loc);
		 
		 Locale loc1 = Locale.getDefault() ; 
		 
		 System.out.println( "default : " + loc1);
		 
//		  Locale loc2 =  Locale.setDefault(Locale.of("en"));
		 
		  String[] loc3 = Locale.getISOLanguages() ; 
		  
		  System.out.println(Arrays.toString(loc3));
		  
		  System.out.println();
		  
		  String[] loc4 = Locale.getISOCountries();
		  
		  System.out.println(Arrays.toString(loc4));
		  
		  
	}
}
