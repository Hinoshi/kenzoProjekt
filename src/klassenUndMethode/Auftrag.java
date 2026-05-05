package klassenUndMethode;

public class Auftrag {
	
	private int menge ;
	
	
	 private  Artikel artikel ;
	 
	  public Auftrag(Artikel artikel , int menge) {
		  
		  this.artikel= artikel ; 
		  
		  this.menge = menge ; 
	}
	  
	public Artikel getArtikel() {
		
		return artikel ; 
	}

	public void setArtikel(Artikel artikel) {
		
		this.artikel = artikel;
	}

	public int getMenge() {
		
		return menge;
		
	}

	public void setMenge(int menge) {
		
		this.menge = menge;
		
	} 
	
	public static double getgesamtwert( Auftrag ... aufträge) { // das ist ein  VArargs . man kann beliebiege parameter mit  dem gleichen Typ schreiben 

		// nur gültig für methode  und steht in Array 
		
		 double summe = 0 ; 
		
		for (Auftrag a : aufträge) {
			
			summe += a.menge*a.artikel.getPreis() ;
		}

		return summe ; 
	}
	
	public static void main(String[] args) {
		
		Artikel a1 = new Artikel(3, 12.99);
		
		Artikel a2 = new Artikel(1, 34);
		
	
		Auftrag Auf1 = new Auftrag(a2, 4);
		
		Auftrag Auf2 = new Auftrag(a1, 120) ;
		
		double gesamt = Auftrag.getgesamtwert(Auf1, Auf2);
		
		System.out.println(" gesamtwert aller Aufträge : " +gesamt);
	}
	

}
