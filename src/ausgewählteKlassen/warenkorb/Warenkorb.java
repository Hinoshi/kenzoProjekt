package ausgewählteKlassen.warenkorb;

import java.util.Vector;

public class Warenkorb {
	
	Vector< Artikel> list = new Vector<>() ;
	
	Artikel artikel ; 
	

	public void  add( Artikel  artikel ) {
		
//		this.artikel = artikel ; 
//		
//		artikel.getMenge();
//
//		artikel.getId();
		
		list.add(artikel) ;
		
	}
	
	
	public double bestellwerte() {
		
		 double summe = 0 ; 
		 
		 for ( Artikel a :list ) {
			
			 summe +=a.getPreis() *  a.getMenge() ; 
		}

		 
		return summe;  
	}
	
	@Override
	public String toString() {
		 StringBuilder sb = new StringBuilder() ;
		 
		  for(Artikel a : list) {
			  
			  sb.append(" Artikel-ID : ").append(a.getId()).append(" Menge: ").append(a.getMenge()).append(" preis :" ).append(a.getPreis()).append("\n") ;
		  }
		
		  
		  sb.append(" GesamtWert des WarenKorb : ").append(bestellwerte());
		  
		  return sb.toString() ;
	}
	
	 public static void main(String[] args) {
		 
		 Warenkorb vektor = new Warenkorb() ;
		 
		 vektor.add(new Artikel(1, 124.232, 3)) ; 
		 
		 vektor.add(new Artikel(12, 2324.232, 24)) ; 
		 
		 vektor.add(new Artikel(13, 1214.232, 35)) ; 
		 
		 vektor.add(new Artikel(14, 1.232, 32)) ; 
		 
		 vektor.add(new Artikel(15, 1234.232, 356)) ; 
		 
		 vektor.add(new Artikel(16, 123.232, 32)) ; 
		 
		  
//		  for (int i = 0; i < size; i++) {
//			
//			 Artikel artikel =vektor.get(i);
//			 
//			 System.out.println();
//		}
//		 

		 System.out.println(vektor);
		 
	}
}
