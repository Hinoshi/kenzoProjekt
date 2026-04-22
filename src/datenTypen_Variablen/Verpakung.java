package datenTypen_Variablen;

import java.util.Scanner;

public class Verpakung {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in);
		
		
		System.out.println( "Geben sie die Anzahl der Karton ein : ");
		
		int Karton  = scan.nextInt();
		
		System.out.println( "geben sie die Anzahl der Flasche ein :");
		
		int flaschen = scan.nextInt() ;
		
		System.out.println( "Wie viel kan ein karton nehmen ");
		
		int anzahl = scan.nextInt();
		
		  int  kartonZahl = flaschen /anzahl;
		  
		  int Rest = Karton ;
		
		 System.out.println();

	}
}
