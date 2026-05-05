package vererbung.mitarbeiter;

public class Angestellter extends Mitarbeiter{

	private static final int MAX_STUFE = 5 ; 
	
	private int stufe ; 
	
	public Angestellter(String nachname, String vorname, double gehalt) {
		
		super(nachname, vorname, gehalt);
		
		this.stufe = 1;
	}
	
	// Stufe um 1 erhöhen
	
	public void  befoerdere() {
		
		if (stufe<MAX_STUFE) {
			
			stufe++ ;
		}
		
		return ;
	}
	
	// Ausgabe aller Variableninhalte
	
	 public void zeigeDaten() {
		 
		 super.zeigeDaten();
	 }
	 
	 //Implementierung der Methode addzulage

	@Override
	public void addZulage(double betrag) {
		
		if (stufe >1) {
			
			super.erhoeheGehalt(betrag);
		}
		
	}

}
