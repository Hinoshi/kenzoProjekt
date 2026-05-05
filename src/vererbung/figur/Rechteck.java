package vererbung.figur;

public class Rechteck  extends Figur{
	
	private  double laenge ; 
	
	private double hoehe ; 
	
	public Rechteck( double hoehe , double laenge) {
		
		this.hoehe = hoehe ; 
		
		 this.laenge = laenge ; 
		 
	}
	 
	@Override
	public void zeichne() {

		System.out.println("Ich bin ein Rechteck ");
		
	}

	@Override
	public double getFlaeche() {
		
		double flaeche = laenge * hoehe;
		
		return flaeche ;
	}

}
