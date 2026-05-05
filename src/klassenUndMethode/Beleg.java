package klassenUndMethode;

public class Beleg {
	 
	private  static int Laufnummer = 10000 ; // klassenVariable für alle belege 

	 private double preis ;  
	 
	   private int nummer ; // individuelle Belegnummer
	 
	
	public Beleg( double preis) {
		
		this.preis = preis ; 
		
		this.nummer = Laufnummer ;  // automatische Vergabe 
		
		Laufnummer++ ; // nächste Nummer vorbereiten 
	}
	
	
	public  int getNummer() {

		return nummer ; 
		
	}
	
	public double getPeis() {
		
		return preis ; 
		
	}
	public static void main(String[] args) {
		 
		
		 Beleg  beleg = new Beleg(1000);

		 Beleg  beleg2 = new Beleg(100);
		 
		 Beleg  beleg3 = new Beleg(98.89);
		 

		 
		 System.out.println( "Belegsnummer : " +beleg.getNummer());
		 System.out.println( "Belegsnummer : " +beleg2.getNummer());
		 System.out.println( "Belegsnummer : " +beleg3.getNummer());
	}
}
