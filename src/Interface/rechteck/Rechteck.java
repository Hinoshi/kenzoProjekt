package Interface.rechteck;

public interface Rechteck {

	int getBreite();
	
	int getHoehe();
	
	static boolean isQuadrat(Rechteck r) {

		return r.getBreite() == r.getHoehe();

	}
	
	static int compare(Rechteck a , Rechteck b) {
		
		if (a.flaecheinhalt()<b.flaecheinhalt()) {
			
			return -1 ;
		}else if (a.flaecheinhalt()>b.flaecheinhalt()) {
			
			return 1 ;
		}
		else {
			
			return 0 ;
		}
	}

	
	int flaecheinhalt();
	
}
