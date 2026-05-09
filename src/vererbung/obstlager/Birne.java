package vererbung.obstlager;

public class Birne implements Obst {

	
	public String farbe ; 
	
	public String name ; 
	
	public Birne(String farbe, String name) {

		this.farbe = farbe ; 
		
		this.name = name ; 
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
