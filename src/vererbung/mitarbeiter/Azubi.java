package vererbung.mitarbeiter;

public class Azubi extends Mitarbeiter {
	
	private int abgelegtePruefungen ; 

	public Azubi(String nachname, String vorname, double gehalt) {
		
		super(nachname, vorname, gehalt);
		
	}
	
	// zahl der abgelegten Prüfungen setzen 
	
	public void  setPruefungen( int anzahl) {

		if (anzahl>=0) {
			
			this.abgelegtePruefungen = anzahl  ; 
		}
	}
	
	// Ausgabe aller  variablenInhalte
	
	
	public void zeigeDaten() {
		
		super.zeigeDaten();
	}
	
	

	@Override
	public void addZulage(double betrag) {
		
		if (abgelegtePruefungen>3) {
			
			super.erhoeheGehalt(betrag);
		}
		
	}

}
