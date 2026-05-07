package klassenUndMethode;

import Interface.displayable.Displayable;
import Interface.displayable.Utilities;

public class Sparbuch implements Displayable {

	
	private int kontonummer;
	
	private double  kapital , zinsatz ;
	
	public Sparbuch(int kontonummer , double kapital ,  double zinsatz) {
		
		this.kontonummer = kontonummer ; 
		
		this.kapital = kapital ; 
		
		this.zinsatz = zinsatz/100;
		
	}
	
	 public double zahleEin( double betrag ) {
		 
//		 kapital=kapital*( 1+ zinsatz);
		  
		 kapital+=betrag ;
		 
		  return kapital ;
	 }
	 
	 public double hebeAb( double betrag) {
		 
		 if (kapital>betrag) {
			 
			 kapital-=betrag ; 
			 
		}else {
			
			System.out.println("Ihr Soldo ist wenig ");
			
		}

		 return kapital ;
		 
	 }
	 
	 public double  getErtrag(double laufzeit) {
		 
		double Ertrag  =kapital*zinsatz*laufzeit;

		 return Ertrag  ; 
	 }
	 
	 public double verzinse() {

		 kapital= kapital * (1+zinsatz);
		 
		return kapital ;
	 }
	 
	  public int getKontonummer() {
		  
		  
		  return kontonummer ;
	  }
	  
	  public double getKapital() {
		  
		  return kapital ;
	  }
	  
	  public double getZinssatz() {
		  
		  return zinsatz ; 
	  }
	  
	  @Override
	  public void display() {
		  
		  System.out.println("Ihr Kontonummer lautet : " +kontonummer + " und Sie fangen mit einem kapital von : " +kapital + " mit einer Zinsatz von : " +zinsatz  +" an .");
		
	  }
	  
	  public static void main(String[] args) {
		
		  Sparbuch sparbuch = new Sparbuch(123098, 1144, 2.5);
		  
		  
		
		   
		   Utilities.display(sparbuch);
		   
		   System.out.println();
		   
		  System.out.println("Sie haben "+  sparbuch.kapital +" gerade .");
		  
		  
		  // ertrag für 03 Jahren 
		  
		  double ertrag = sparbuch.getErtrag(3);
		   
		   // Kapital nach einem Jahr
		   
		   sparbuch.verzinse();
		   
		   System.out.println("Kapital nach einem Jahr : " + sparbuch.getKapital());
		   
		   System.out.println("");
		   
		   sparbuch.zahleEin(3000);
		   
		   System.out.println("Sie haben jetzt : " +sparbuch.getKapital());
		   
		   sparbuch.hebeAb(1200);
		   sparbuch.hebeAb(200);
		   sparbuch.hebeAb(1008.53);
		   
		   System.out.println("Sie haben nach der Abhebung : " +sparbuch.getKapital());
		   
		   

		   
	}


}
