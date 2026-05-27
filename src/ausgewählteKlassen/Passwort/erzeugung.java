package ausgewählteKlassen.Passwort;

public class erzeugung {
	
	
	// erzeugt eine s-repräsentierten Wert  ein Object entsprechend der Wrapper-Klassen
	
	static Integer valueOf(String s) {
		
		return Integer.valueOf(s);  // der Typ muss immer konvergiert sein 
		
	}
	
	static Integer valueOf(String s , int base) {
		
		return Integer.valueOf("101" ,2);
	}
	


	public static void main(String[] args) {
		
		Integer intobj = Integer.valueOf(23);
		
		Double dob = Double.valueOf(12.2);
		
		Boolean bo = Boolean.getBoolean("True");
		
		System.out.println(bo);
		
		
		System.out.println(intobj);
		
		System.out.println(valueOf("43"));
		
		System.out.println(valueOf("12234435", 3));
		
		System.out.println(dob.equals(intobj));// für Vergleich  ob zwei ob die gleiche Wrapper klasse hat 
		
		System.out.println(valueOf("32").equals(valueOf("32", 3)));
		
		System.out.println(dob.compare(12.23, 12.4)); 
		
		System.out.println(dob.parseDouble("12.3")); // hier ist eine Umwandlung
	}
}
