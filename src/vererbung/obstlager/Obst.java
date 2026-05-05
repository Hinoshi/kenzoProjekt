package vererbung.obstlager;

public abstract class Obst {
	
	public String farbe ; 
	
	public String name ; 
	
	public Obst(String farbe , String name ) {
		
		this.farbe= farbe ;
		
		this.name = name ; 
	}

	public abstract String getName();
	
	public abstract String getFarbe();
	
	
}
