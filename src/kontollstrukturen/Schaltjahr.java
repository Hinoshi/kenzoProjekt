package kontollstrukturen;

import java.util.Scanner;

public class Schaltjahr {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println( "Geben sie ein Jahr hier ein : ");
		
		int jahr = scan.nextInt();
		
		boolean schaltjahr ;
		
		if (jahr%400 == 0) {
			
			schaltjahr = true ;
			
		}else if (jahr%100==0) {
			
			schaltjahr = false ;
				
				System.out.println(jahr +" ist keine Schaltjahr");

		}else if (jahr%4 ==0) {
				
			schaltjahr = true ;
				
				
		}else {
			schaltjahr = false;
				
				
		}
		
		
		if (schaltjahr) {
			
			System.out.println(jahr +" ist eine Schaltjahr");
		}else {
			
			System.out.println(jahr +" ist keine Schaltjahr");
		}

		
	}
}
