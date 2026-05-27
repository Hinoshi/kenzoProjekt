package ausgewählteKlassen.rechner;

import java.util.Vector;

public class Test {

	
	public static void main(String[] args) {
		 
		Vector<Float>  rechen = new Vector<>();
		
		rechen.add( new Addition().grundrechenArten(12, 24));
		
		rechen.add( new Division().grundrechenArten(12, 24));
		
		rechen.add( new Substraction().grundrechenArten(12, 24));
		
		rechen.add( new Multiplikation().grundrechenArten(12, 24));
		
		 for(Object a : rechen ) {
			 
			 System.out.println(a);
		 }
		
		
	}
}
