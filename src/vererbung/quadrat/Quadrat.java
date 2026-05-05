package vererbung.quadrat;

public class Quadrat extends Rechteck{

	private double laenge ; 
	
	public Quadrat(double laenge) {
		
		 this.laenge = laenge ;
		
		super(laenge, laenge) ; 
	}

	public double getLaenge() {
		
		return laenge;
		
	}

	public void setLaenge(double laenge) {
		
		this.laenge = laenge;
		
	}
}
