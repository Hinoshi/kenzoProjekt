package exception;

public class Sum {

	public static long sum(int n) {
		
		int sum = 0 ; 
		
		for (int i = 0; i <=n; i++) {
			
			sum+=i ; 
			
			if (n <= 0) {
				
				throw new IllegalArgumentException("Der zahl muss nicht kleiner oder gleich 0");
			}
		}
		
		return sum ; 
	}
	
	public static void main(String[] args) {
		
		System.out.println( Sum.sum(0));
	}
}
