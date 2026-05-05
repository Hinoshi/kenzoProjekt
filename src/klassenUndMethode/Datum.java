package klassenUndMethode;

public class Datum {

	private int tag , monat , jahr ; 
	
	private Tage tage ; 
	
	public Datum( int tag , int monat , int jahr ) {
		
		this.tage = new Tage();
		
		this.jahr = jahr;
		
		this.monat = monat ;
		
		 this.tag= tag ; 
	}
	
	public void display() {
		
		int anzahl = tage.tage(jahr, monat);
		
		if (anzahl>tag) {
			
			System.out.println("ungültiges Datum ");
			
			return ;
		}
		
		System.out.println("Der Monat hat " + anzahl + "  Tage ");
		
		System.out.println("wir sind am :  " + tag +"/" +monat + "/"+ jahr);
		
	}
	
	public static void main(String[] args) {
		
		Datum datum = new Datum(12, 12,2024) ;

		datum.display();

	}
}
