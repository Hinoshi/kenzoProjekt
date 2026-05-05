package klassenUndMethode;

public class Verzinzung {

	public static double zinzen( double kapital , double zinsatz , int jahre) {
		
		if (jahre == 0) {
			
			return kapital ; 
			
				}
		
		double verzinzung = kapital* (1+(zinsatz/100) );

		return zinzen(verzinzung, zinsatz, jahre-1) ;
		
	}
	
	public static void main(String[] args) {
		
		Verzinzung verzin = new Verzinzung();
		
		double gesamt = Verzinzung.zinzen(1208322, 12, 4);
		
		
		System.out.println(gesamt);
		
	}
}
