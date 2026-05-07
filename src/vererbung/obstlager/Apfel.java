package vererbung.obstlager;

public class Apfel implements Obst  {
	
	
	private String farbe;
	
	private String name;
	
	public Apfel(String farbe, String name) {
		
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
