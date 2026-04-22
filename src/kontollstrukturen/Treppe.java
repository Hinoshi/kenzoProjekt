package kontollstrukturen;

import java.util.Scanner;

public class Treppe {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in);
		
		String  zeichen ="***";
		
		System.out.println( "Geben sie die Anzahl der Treppe ein : ");
		
		int h = scan.nextInt();
		
		System.out.println("Geben sie die Anzahl der Breite ein");
		
		int breite = scan.nextInt();
		
		int maxbreite = h*breite ;
		

		for (int i = 1; i <=h; i++) {
			
			int sterne = i *breite ;
			
			int leer = maxbreite-sterne;
			
			
			for (int k = 0; k <= leer; k++) {
				
				System.out.print(" ");
			}
		
//			System.out.println("");
			
			for (int j =1; j<=i; j++) {
				
				System.out.print("***");
			}
			
			System.out.println();

		}
	}
}
