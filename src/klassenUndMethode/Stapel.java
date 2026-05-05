package klassenUndMethode;

public class Stapel {
	
	
	private int [] zahl = new int[1]; // Startkapazität
	
	private int top = 0 ;  // anzahl der Elemente in Stack

	public void push(int e) {
		
		if (top == zahl.length) {
			
			int []	zahl2 = zahl ;
			
			zahl2 = new int [zahl.length*2] ;  // neues Array mit doppelte Länge 

		for (int i = 0; i < zahl.length; i++) {
			
			zahl2[i] = zahl[i];  // alte Werte kopieren 
		}
		
		zahl = zahl2 ;  // neues Array übernehmen 
		
		}
		
		// element oben einfügen 
		
		zahl[top] = e ; 
		
		top ++ ;
	}
	
	public  int pop() {

			
			if (top == 0) {
				
				throw new RuntimeException("Stack ist leer");

			}
			
			top -- ;
			
		return zahl[top];
	}
	
	public void print() {
		
		System.out.println( "Stack : ");
		
		for (int i = 0; i < top; i++) {
			
			System.out.println(zahl[i] + " ");
			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		
		Stapel stap = new Stapel();
		
		stap.push(23);
		
		stap.push(10);
		stap.push(20);
		stap.push(30);
		stap.push(40);   // hier wird das Array automatisch verdoppelt

		stap.print();

        System.out.println("pop: " + stap.pop());
        System.out.println("pop: " + stap.pop());

        stap.print();
	}
}
