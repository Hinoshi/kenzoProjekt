package rechnen;

public enum Rechnen {

	AD {
		@Override
		public double compute(double x, double y) {
			
			double  value = x + y ;
			
			return value;
		}
	} , MU {
		@Override
		public double compute(double x, double y) {
			
			double  value = x * y ;
			
			return value;
		}
	} 
	
	, DI {
		@Override
		public double compute(double x, double y) {
			
			double  value = x / y ;
			
			return value;
		}
		
	} 
	
	, SU {
		@Override
		public double compute(double x, double y) {
			
			double  value = x - y ;
			
			return value;
		}
	} ;
	
	public abstract double compute(double x , double y );
	
	public static void main(String[] args) {
		
		Rechnen rechnen = null ; 
		
		System.out.println("Die Addition ist : " +Rechnen.AD.compute(12,45));

		System.out.println("Die Division ist : " +rechnen.DI.compute(12,45));

		rechnen.DI.compute(23, 20);
	}
}
