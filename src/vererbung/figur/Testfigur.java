package vererbung.figur;

public class Testfigur {

	  
	  public static void main(String[] args) {

		  Figur[] figur = new Figur[2]; 

			  figur[0] = new Kreis(12.23);
			  
			  figur[1] = new Rechteck(34, 23);
		
			  for (Figur f : figur) {
				  
				  f.zeichne();
				  
				  System.out.println(f.getFlaeche());
			  }
	}
}
