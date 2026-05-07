package vererbung.obstlager;

public class Orange  implements Obst {

	private String farbe;
	
	private String name;
	
	public Orange(String farbe, String name) {
		
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
