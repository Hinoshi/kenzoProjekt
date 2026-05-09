package exception;

public class Monat {

	private int monat ; 
	
	String monatName ;
	
	public Monat(int monat) throws MonatAusnahme {
		
		this.monat = monat ; 
		
		if(monat <=0 || monat>12) {
			
			throw new MonatAusnahme("Der zahl muss nicht über 12 sowie unter null sein");
		}

	}
	
	public String getMonatName() throws MonatAusnahme  {
	
		switch (monat) {

		case 1: return "Januar";
		
		case 2: return "Februar";
		
		case 3: return "March";
		
		case 4: return "April";
		
		case 5: return "Mai";
		
		case 6: return "June";
		
		case 7: return "Juli";
		
		case 8: return "August";
		
		case 9: return "September";
		
		case 10: return "Oktober";
		
		case 11: return "November";
		
		case 12: return "Dezember";
		
		}

		return monatName ; 
	}
	
	public static void main(String[] args) throws MonatAusnahme {
		
		try {
		Monat monat = new Monat(14);

		
		System.out.println(monat.getMonatName());
		
		
		
		}catch (MonatAusnahme e) {
			
			System.out.println(e.getLocalizedMessage());
			
			System.out.println(e.getMessage());
			
			System.out.println(e.getCause());
		}
	}
}
