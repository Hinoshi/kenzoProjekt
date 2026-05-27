 package ausgewählteKlassen.Passwort;

public class Laufzeit {

	public static void main(String[] args) {
		
		
		long start = System.currentTimeMillis();
		
		 Long sum = 0L ;
		 
		 for (int i = 0; i < Integer.MAX_VALUE; i++) {
			
			  sum +=i; 
	 
		}
		 
		  long End = System.currentTimeMillis();
 
		 System.out.println( "Die Summe ist  = " + sum);
		 
		  System.out.println( " Die Rechnung erfolg durch " + (End-start) + "  millisekunden ");
	}
	  
}
