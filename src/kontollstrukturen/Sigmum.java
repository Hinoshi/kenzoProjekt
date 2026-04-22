package kontollstrukturen;

import java.util.Scanner;

public class Sigmum {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Geben Sie drei Zahlen ein .");
		
		
		System.out.println("Geben Sie erste Zahlen ein :");
		float x = Scan.nextFloat() ; 
		
		
		System.out.println("Geben Sie zweite Zahlen ein :");
		float y = Scan.nextFloat();
		
		System.out.println("Geben Sie dritte Zahlen ein :");
		float z  = Scan.nextFloat();
		
		float k = x-y ;
		
		if (k<0) {
			
			k=(-1)*(x-y);
		}
		
		if (k<z) {
			
			
			System.out.println(0);
		}else if (k<z) {
			
			
			System.out.println(0);
		}

		if (k<z) {
	
	
			System.out.println(0);
		}
	}
}
