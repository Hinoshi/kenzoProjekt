package vererbung.quadrat;

public abstract class Rechteck {

	 double  breite ; 
	 
	 double hoehe ;
	 
	 public Rechteck(double breite , double hoehe) {
		 
		 this.breite = breite ; 
		 
		 this.hoehe = hoehe ; 
	}

	 public double getBreite() {
		 
		 return breite;
		 
	 }

	 public void setBreite(double breite) {
		 
		 this.breite = breite;
		 
	 }

	 public double getHoehe() {
		 
		 return hoehe;
		 
	 }

	 public void setHoehe(double hoehe) {
		 
		 this.hoehe = hoehe;
		 
	 } 
	 
	 public  double getflaeche(){
		 
		 double flaeche = hoehe* breite ; 
		 
		 return flaeche ; 
	 }
	 
	 
	 
}
