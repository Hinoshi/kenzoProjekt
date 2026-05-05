package klassenUndMethode;

public class Tage {
	 
	 public int tage( int jahr , int monat) {


		 if (monat<=0 || monat>12) {
			
			 return 0 ; 
		}

		 if (monat==2) {
				 
			if (jahr % 4 == 0 && (jahr % 100 != 0 || jahr % 400 == 0)) {
					 
				return 29 ;	
				
				 }	
			
				return 28 ;

			}
		 
		 if (monat == 4 || monat == 6 || monat == 9 || monat == 11) {
				 
			 return 30;
				
		 }
			 
			return 31 ; 
	}
	 
	 public static void main(String[] args) {
		
		 
		 Tage t= new Tage();
		 
		System.out.println(t.tage(1212232, 2)); 
	}
}
