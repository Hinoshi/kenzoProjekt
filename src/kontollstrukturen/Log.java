package kontollstrukturen;

import java.util.Iterator;
import java.util.Scanner;

public class Log {

	
	public static Scanner Scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		// hier müssen wir die kleinste ganzahlige Wert von n berechne 
		
		 System.out.println("Geben sie eine Zahl hier ein : ");
		
		int Zahl = Scan.nextInt();
		int value ;
		
		int n= 0  ;
		
		int counter= 0  ;
		
//		do {
//			
//			Zahl= Zahl/2 ;
//			
//			if (Zahl%2!=0) {
//				
//				Zahl= Zahl-1 ;
//			}
//			
//			if (Zahl==0) {
//				
//				n+=1 ;
//				
//				break ;
//			}
//			
//			n++ ;
//			
//		} while ((2*Math.exp(n))>=Zahl);
//		
		
		// das ist eine gute Logisch aber funktionniert nicht 
		
		
		// normale logisch 
		
		
		while ((Math.pow(2, counter))<=Zahl) {
			
			value= (int) Math.pow(2, counter) ; 
			
			n++ ;
			
			counter++ ;
			
		}
		
		System.out.println( " n ist : " +counter );
		
	}
}
