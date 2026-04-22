package kontollstrukturen;

import java.util.Scanner;

public class Fakultät {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println( "Geben die die Zahl , die die Fakultät berechnet wird : ");
		
		long zahl = scan.nextLong();
		
		long result = 1 ; 
		
		if ( zahl == 0 ) {
			
			System.out.println( "Die Fakultät ist : " +1);
		}else {
			
			System.out.println( "Die fakultät von " +zahl+"! ist : " );

			do {
				
				result*=zahl ;
				
				zahl-=1;
				
			} while (zahl>=1);
			
			System.out.print(  result);
		}
	}
}
