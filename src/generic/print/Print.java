package generic.print;

import generic.pair.Pair;

public class  Print <T, U> extends Pair<T, U> {
	
	public Print( T a , U b) {
		
		this.value = a ;
		
		 this.wert = b ;
	}
	
	
	public static void print (Pair<? , ?> p) {
		
		p.getValue();
		
		p.getWert();
		
		System.out.println("Die ANtwort ist ( " +p.getValue() +" , " +p.getWert() +" ) " );
		
	}

}
