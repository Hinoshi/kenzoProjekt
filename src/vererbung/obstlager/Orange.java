package vererbung.obstlager;

public class Orange extends Obst {

	public Orange(String farbe, String name) {
		
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
