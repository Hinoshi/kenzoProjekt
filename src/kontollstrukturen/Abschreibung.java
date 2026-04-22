package kontollstrukturen;

public class Abschreibung {

	public static void main(String[] args) {
		
		
		double  buchwert = 15000 ;
		
		int restwert = 100 ;
		
		 int jahr = 0 ;
		
		 while (buchwert > restwert) {
			
			buchwert =buchwert *0.60;
			
				jahr+=1 ;
				System.out.println("Sie haben jetzt im jahr " +jahr +" : "  +buchwert); 

			 
			 
			 if (buchwert<=restwert) {
				
				 break ;
			}
			 
		} 
	}
}
