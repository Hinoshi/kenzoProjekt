package kontollstrukturen;

import java.util.Scanner;

public class Euklid {
	
	private static  Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int zahl1 ; 
		
		int  zahl2 ;
		
		int result ;
		
		System.out.println("geben sie 02  Zahlen ein .");
		
		do {
			
			System.out.println( "Zahl 1 : ");
			
			zahl1 = scan.nextInt();
			
			System.out.println( "Zahl 2 : ");
			
			zahl2 = scan.nextInt();
	
		} while (zahl1 <=0 || zahl2 <=0);
		
		if (zahl1<zahl2) {
			
			int temp = zahl1 ; 

			zahl1 = zahl2;
			
			zahl2 = zahl1 ; 
			
		}else {
			 
			while(zahl2!=0 ) {

				result = zahl1%zahl2 ;
				
				zahl1 = zahl2 ;
				
				zahl2 = result;
			}

			System.out.println(" der gemeinsam Große ist : "  +zahl1);
		}
		
		
		
	}
}


