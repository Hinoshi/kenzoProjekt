package kontollstrukturen;

import java.util.Scanner;

public class Quersumme {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in);
		
		System.out.println("berechnen wir die Quersumme aller zahlen .");
		
		
		System.out.println("Geben sie  die Zahl ein : ");
		
		int zahl = scan.nextInt();
		
		int Quersumme = 0 ;
		
		while(zahl>0) {
			
			Quersumme= Quersumme+ zahl%10 ;
			
			zahl= zahl/10 ;
			
		}
	
		System.out.println("die Quersumme ist : " +Quersumme);
	}
}
