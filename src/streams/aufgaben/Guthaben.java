package streams.aufgaben;

public class Guthaben {

	 double  preis  ; 
	 
	 public Guthaben(  double  preis ) {

		 this.preis = preis ; 
	}
	 
	 double  zinzen(double zins) {
		
		  double value = zins*( 1+preis) ; 
		  
		return value ; 
	}
}
