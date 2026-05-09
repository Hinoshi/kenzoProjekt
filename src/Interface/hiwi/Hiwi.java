package Interface.hiwi;

public class Hiwi implements StudHilfskraft{

	
	private  int matrikelNummer ;
	
	private String name ; 
	
	private double gehalt ; 
	
	private int dauer ; 
	
	

	@Override
	public int getMatrNr() {
		
		return matrikelNummer;
	}

	@Override
	public void setMatrNr(int matrikelNummer) {
		
		this.matrikelNummer= matrikelNummer ; 
		
	}

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public void setName(String name) {
		
		this.name= name ; 
		
	}

	@Override
	public double getGehalt() {
	
		
		return gehalt ;
		
	}

	@Override
	public void setGehalt(double gehalt) {

		 this.gehalt= gehalt  ; 
		
	}

	@Override
	public int getDauer() {
		
		return dauer;
	}

	@Override
	public void setDauer(int dauer) {
		
		this.dauer= dauer ;
		
	}
	
	public static void main(String[] args) {
		
		Hiwi person = new Hiwi() ; 
		
		person.setName("Kenzo");
		person.setDauer(40);
		person.setMatrNr(344456321);
		person.setGehalt(3000);
		
		System.out.println("Ich heiße " +person.getName()+" mit der Matrikelnummer : " +person.getMatrNr() +" und  habe unter der Woche "+person.getDauer() +" Stunden . Monatlich erhalte ich " +person.getGehalt() +" " );
		
	}

}
