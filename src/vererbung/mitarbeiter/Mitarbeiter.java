package vererbung.mitarbeiter;

public abstract class Mitarbeiter {

	
	protected  String nachname ; 
	
	protected  String vorname ; 
	
	 protected double gehalt ; 
	 
	 public Mitarbeiter(String nachname , String vorname , double gehalt) {
		 
		 this.gehalt = gehalt ; 
		 
		 this.nachname = nachname ; 
		 
		  this.vorname = vorname ; 
	 }
	 
	 // Erhöhung des Gehalt um betrag 
	 
	 public void erhoeheGehalt( double betrag) {
		 
		 gehalt+=betrag ; 
		 
		 System.out.println( " neues Gehalt : " + gehalt);
		 
	 }
	 
	 // Ausgabe aller Variablenimhalte 
	 
	 public void zeigeDaten() {
		 
		 
		 System.out.println("Sie heißen " + vorname + " " +nachname +" und ihr Gehalt ist gerade : "+gehalt);
	 }
	 
	 // Gehalt durch Zulage erhöhen
	 
	 public abstract void addZulage(double betrag) ;
	 
	 
	 
	 
}
