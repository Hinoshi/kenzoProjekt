package datenTypen_Variablen;

import java.util.Scanner;

public class Teilen {
public static void main(String[] args) {
	
	System.out.println( "hier geht darum zu wissen , ob eine Zahl mit einer andere teilbar ist ? wenn 0  die ist nicht die antwort ist ja andersfalls (1) ja  ");
	
	// wir sollen überprüfen ob x durch y teilbar ist :
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Geben sie die erste zahl ein : ");
	
	int x = scan.nextInt();
	
	System.out.println("Geben sie die zweite zahl ein : ");
	
	int y = scan.nextInt(); 

	int response = (x%y == 0)? 0:1 ;
	
	System.out.println("Die Anwort ist : " +response);
	
	if (response==0) {
		
		System.out.println( " diese zwei Zahlen sind teilbar ");
	}else {
		System.out.println("die sind nicht teilbar ");
	}
}
}
