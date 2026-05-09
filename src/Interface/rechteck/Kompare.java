package Interface.rechteck;

public class Kompare implements Rechteck {

	
	private int breite ; 
	
	private int hoehe ; 
	
	
	 
	 public Kompare(int breite , int hoehe) {
		
		 this.breite= breite ; 
		 
		 this.hoehe = hoehe ; 
		 
	}
	 
	@Override
	public int getBreite() {
		
		return breite;
	}

	public void setBreite(int breite) {
		this.breite = breite;
	}

	public void setHoehe(int hoehe) {
		this.hoehe = hoehe;
	}

	@Override
	public int getHoehe() {
		
		return hoehe;
	}
	
	@Override
	
	 public  int flaecheinhalt() {
		
		int flaeche =	getBreite()*getHoehe() ;

		return flaeche;
	}

	public static void main(String[] args) {

		
		 Rechteck a  = new Kompare(12,12); 
		 
		 Rechteck b = new Kompare(23,12) ; 

		
		System.out.println(Rechteck.compare(a, b));
		
		System.out.println(Rechteck.isQuadrat(a));
		System.out.println(Rechteck.isQuadrat(b));
	}

}
