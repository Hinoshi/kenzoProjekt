package klassenUndMethode;

public class halbieren {
	
	public double rekursiv( double zahl ) {
		
		double result = zahl; 
		
		if (zahl<=3) {
			
			//throw new  RuntimeException (" der n wert muss nicht größer als die Zahl ");
			
			return zahl ; 
		}

			 result = rekursiv(zahl/2);

		return result ;
	}
	
	public static void main(String[] args) {
		
		halbieren half = new halbieren() ; 
		
		 double halb = half.rekursiv(15);
		 
		 System.out.println(halb);
	}
}
