package klassenUndMethode;

import java.util.Scanner;

public class Ringpuffer {

	
	Scanner Scan = new Scanner (System.in);
	
	 private int []ring ; // feste Länge 
	 
	 private int index ;  // für Position der Array
	 
	public Ringpuffer(int size ) {
		
		ring =  new int [size] ;

	}
	
	// schreiben einen Wert in der Ringpuffer 
	
	public void write( int value) {
		
		ring[index] = value ; 
		
		index=(index+1)%ring.length ;
		
	}
	
	// gibt den gesamten Inhalt aus 
	
	public void  print( ) {

		for (int i =0; i < ring.length; i++) {
			
			System.out.println("index : " + i +" --> : " + ring[i]);
			
		}
	}
	
	public static void main(String[] args) {

		Ringpuffer ring  =  new Ringpuffer(5);
		
		ring.write(12);
		ring.write(32);
		ring.write(34);
		ring.write(345);
		ring.write(45);
		
		ring.print();
		
		System.out.println();
		
		ring.write(213); // überschreibt 12
		ring.write(24545);// überschreibt 132
		
		ring.print();
	}
	
}
