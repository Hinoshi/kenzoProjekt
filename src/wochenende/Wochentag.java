package wochenende;

public enum Wochentag {
	
	MO ("Montag") , DI ("Dientag"), MI("Mittwoch") , DO("Donnerstag") , FR("Freitag") , SA("Samstag") , SO("Sonstag");
	
	private final String name  ; 
	
	private  Wochentag(String name) {

		this.name = name ; 

	}

	public static  int bisWochenende(Wochentag wochentag ) {
		
		switch (wochentag) {
		
		case MO: return 5 ; 
		
		case DI: return 4 ; 
		
		case MI: return 3 ; 
		
		case DO: return 2 ; 
		
		case FR: return 1 ; 
		
		case SA: 
		
		case SO: return 0 ;
		
		}
		return 0;
		
	}
	
	public String getName() {
		
		return name;
	}

	public static void main(String[] args) {
		
		Wochentag wochentag = Wochentag.MO;
		
		System.out.println(wochentag.getName());
		
		for (Wochentag wochen : Wochentag.values()) {
			
			System.out.println(wochen.ordinal() + " " + wochen.name() + " " + wochen);
			
			//ordinal für eine enumeration
			
			// name für den Aufrauf der Name 
			
			// value für Aufrauf des Namen von jeden Elemente der enum
			
			//
		
		}
	}
}
