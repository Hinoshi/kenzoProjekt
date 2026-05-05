package klassenUndMethode;

public class Abschreibung {
	
	private double  anschaffungsPreis ; // fest preis 
	
	private double abschreibungssatz;  // in prozent
	
	private double nutzungsjahr ;

	public Abschreibung() {
	
		anschaffungsPreis = 15000 ; 
		
		abschreibungssatz = 40/100 ; 
		
		nutzungsjahr = 100 ; 
		
	}
	
	public Abschreibung(double anschaffungspreis ,double abschreibungssatz , int nutzungsjahr){
		
		this.abschreibungssatz= abschreibungssatz / 100  ;
	
		this.anschaffungsPreis = anschaffungspreis ;
		
		this.nutzungsjahr = nutzungsjahr ; 
		
	}
	
	// Bei jedem jahr wird die gleiche Betrag abgeschrieben  und der Buchwert wird jährlich abgerechnet 
	
	public double lineareAbschreibung(int jahr) {
		
		
		double Abschreibung = anschaffungsPreis/nutzungsjahr ; 
		
		double Buchwert = 0 ; 
		
		for (int i = 0; i <=jahr; i++) {
			
			 Buchwert = anschaffungsPreis - i*Abschreibung ;
			 
			 System.out.println( "Jahr  " +i + " : " + Buchwert);
			
		}

		return Buchwert  ; 
		
	}
	
	// Hier wird jedes Jahr  ein prozentsatz von aktuellen Buchwert  abgeschrieben 
	
	public double geometrischDegressivAbschreibung() {
		
		double Buchwert = anschaffungsPreis ; 
		
		for (int i = 1; i <=nutzungsjahr; i++) {
			
		Buchwert *=(1-abschreibungssatz);
		
		 System.out.println( "Jahr  " +i + " : " + Buchwert);
		 
		}
		
		return Buchwert ; 
		
	}
	
	public static void main(String[] args) {
		
		Abschreibung abschreib = new Abschreibung() ; 
		
		Abschreibung abschreibung = new Abschreibung(200000 , 37 , 20) ;
		
		double Preis = abschreib.geometrischDegressivAbschreibung();
		
		System.out.println( "Die aktuelle Abschreibung  für eine geometrisch degressiver Abschreibung ist : ");
		
		double Preis2 = abschreib.lineareAbschreibung(53);
		
		System.out.println( "Die aktuelle Abschreibung  für eine Lineare Abschreibung ist : ");
		
		
		double Preis3 = abschreibung.geometrischDegressivAbschreibung();
		
		System.out.println( "Die aktuelle Abschreibung  für eine geometrisch degressiver Abschreibung ist : " );
		
		double Preis4 = abschreibung.lineareAbschreibung(53);
		
		System.out.println( "Die aktuelle Abschreibung  für eine Lineare Abschreibung ist : ");
	
	
	}
}
