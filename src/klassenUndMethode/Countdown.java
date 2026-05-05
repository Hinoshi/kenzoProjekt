package klassenUndMethode;

public class Countdown {

	
	public void rekursiv(int n) {

		if (n<=0) {
			
			System.out.println("Zero");
			
			return ;

		}

		 System.out.println("n = " +n);
		 
		 rekursiv(n -1 ) ;

	}
	
	public static void main(String[] args) {
		
		Countdown count = new Countdown();
		
		 count.rekursiv(13);
	}
}
