package vererbung.figur;

public class Kreis  extends Figur{

	 private double radius  ; 
	 
	 public Kreis(double radius) {
		
		 this.radius = radius ;
	}

	@Override
	public void zeichne() {
		
		System.out.println("Ich bin eine Kreis .");
		
	}

	@Override
	public double getFlaeche() {
		
		double flaeche = Math.pow( radius , 2) *Math.PI;
		
		return flaeche;
	}

}
