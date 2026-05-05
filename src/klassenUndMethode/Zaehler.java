package klassenUndMethode;

public class Zaehler {
	
	private int zaehler;

	public Zaehler(int wert) {
	
		zaehler = wert ;
	}

	
	public int  Hochzaeler() {
		
		zaehler+=1;
		
		return zaehler ;
	}
	
	public int zuruecksetzen() {
		
		zaehler = 0 ;
		
		return zaehler ;
	}
	
	public int getWert() {
		
		return zaehler ;
	}
	
	public static void main(String[] args) {
		
		Zaehler Zahl = new Zaehler(4);
		
		
		
		
		Zahl.Hochzaeler();
		Zahl.Hochzaeler();
		Zahl.Hochzaeler();
		
		System.out.println(Zahl.getWert());
		
		Zahl.zuruecksetzen();

		System.out.println(Zahl.getWert());
		
		Zaehler Zahl1 = new Zaehler(3);
		
		Zahl.Hochzaeler();
		Zahl.Hochzaeler();
		Zahl.Hochzaeler();
		
		System.out.println(Zahl.getWert());
		
		Zahl.zuruecksetzen();

		System.out.println(Zahl.getWert());
		
	}

}
