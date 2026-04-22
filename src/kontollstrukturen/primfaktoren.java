package kontollstrukturen;

import java.util.Scanner;

public class primfaktoren {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int zahl ;
		
		int t = 2 ;
		
		int result = 0 ;
		
		do {
			
			System.out.println("geben sie eine Zahl ein : ");
			
			 zahl = scan.nextInt();
			
		} while (zahl<2);
		
		while(zahl>1) {
			
			if(zahl%t==0) {
				
				zahl=zahl/t ;
				
				System.out.println(  " die Primzahlen sind für die Zahl " +zahl +" : "+t );
				
			}else {
				
				t+=1 ;
			}
		}
	}
}
