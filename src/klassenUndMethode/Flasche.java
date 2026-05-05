package klassenUndMethode;

public class Flasche {

	private int id ; 
	
	 private int inhalt ; //in ml 
	 
	  private int fassungdvermoegen ; // in ml
	  
	  public Flasche(int id ,int inhalt,int fassungdvermoegen ) {
		
		   this.id = id ;
		   
		   this.fassungdvermoegen = fassungdvermoegen ; 
		   
		   this.inhalt = inhalt ;
	}
	  
	  public Flasche(int id ,int inhalt) {
		
		   this.id = id ;
		   
		   this.fassungdvermoegen = 500 ; 
		   
		   this.inhalt = inhalt ;
	}
	  
	  public Flasche(int id ,double prozent ,int fassungdvermoegen) {
		
		   this.id = id ;
		   
		   this.fassungdvermoegen = fassungdvermoegen; 
		   
		  
		   this.inhalt = (int) (fassungdvermoegen * (prozent/100 ));
	}
	  
	  //zum Setzen des Inhalts, dabei darf die Flasche nicht überlaufen,
 
	   public void setzen() {
		   
		  
		   
	   }
	   
	   // zum Nachfüllen, 
	   
	   public void nachfüllen() {
		   
		   
	   }
	   
	   //zum Verschütten einer gewissen Menge, 
	   
	   public void verschuetten() {
		   
		   
	   }
	   
	   // zum Umfüllen in eine andere Flasche, die leer oder auch nicht leer sein kann,
	   
	   
	   public void umfuellen() {
		   
		   
	   }
	   
	   //zum Feststellen, ob die Flasche leer oder voll ist,
	   
	   public void leer() {
		   
		   
	   }
	   
	   //zur Ermittlung des Füllgrads in Prozent,
	   
	   public void ermittlung() {
		   
		   
	   }
	   
     //zum Feststellen, welche die größere Flasche (gemäß Fassungsvermögen) von zwei Flaschen ist.
	   
	   public void groeße() {
		   
		   
	   }
}


