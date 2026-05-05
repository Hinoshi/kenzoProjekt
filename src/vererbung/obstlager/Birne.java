package vererbung.obstlager;

public class Birne extends Obst {

	public Birne(String farbe, String name) {
		
		super(farbe, name);
		
	}

	@Override
	public String getName() {
		
		return  name ; 
	}

	@Override
	public String getFarbe() {
		
		return farbe ;  
	}

}
