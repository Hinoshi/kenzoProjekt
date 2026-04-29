package arrays;

import java.util.Scanner;

public class Statistik {

	public static void main(String[] args) {
		
		int[] array = null;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("geben sie Die Azahl des Elements m, dass sie einfügen wollen .");
		
		int anzahl = scan.nextInt();
		
		array =new int[anzahl];
		
		for (int i = 0; i <anzahl; i++) {
			
			System.out.print("Element "+i + " : " );
			
			array[i]=scan.nextInt();
		}
		
		for(int arry : array) {
			
			System.out.print(arry+ ",");
		}
		
		int größe = array[0];
		
		int kleinste = array[0] ;
		
		int mittelwert= 0 ; 
		
		for (int x :array) {
			
			if (x<kleinste) {
				
				kleinste =x;
				
				System.out.println(kleinste);
				
			}else if (x>größe) {
				
				größe =x;
				
				System.out.println(größe);
			}
			
			mittelwert +=x  ;

		}
		
		double Mittel = (double)mittelwert/anzahl;
		
		System.out.println("Die Mittelere Wert ist : "+Mittel);
		
		System.out.println("Die kleinste Wert ist : " +kleinste);
		
		System.out.println("Die Größe Wert ist : " +größe);
	}
}
