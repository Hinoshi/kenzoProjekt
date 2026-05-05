package klassenUndMethode;

public class Rechteck {

	
	double  breite ; 
	
	double  hoehe ;
	
	public Rechteck(double  breite , double  hoehe ) {
		
		this.breite = breite ; 
		
		this.hoehe = hoehe ; 
	
	}
	
	public Rechteck(int   laenge) {

		this.breite = laenge ; 
		this.hoehe = laenge ; 
	}

	public double  getBreite() {
		
		return breite;
	}

	public void setBreite(double  breite) {
		
		this.breite = breite;
	}

	public double getHoehe() {
		
		return hoehe;
	}

	public void setHoehe(double  hoehe) {
		
		this.hoehe = hoehe;
	}
	
	public double flaecheInhalts() {
		
		 double flaecheInhalts = getBreite()*getHoehe();
		 
		 return flaecheInhalts ; 
	}
	
	public double umfang() {
		
		double umfang = (getBreite()+getHoehe())*2 ; 
		
		return umfang ; 
	}

	public static void main(String[] args) {
		
		
		Rechteck a1 = new Rechteck(12, 3.5);
		
		System.out.println( "der FlaächeInhalt ist : " + a1.flaecheInhalts());
		
		Rechteck a = new Rechteck(3);
		
		System.out.println("Der umfang ist : " + a.umfang());
		

	}
	
}
