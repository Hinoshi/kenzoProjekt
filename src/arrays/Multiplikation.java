package arrays;

import java.util.Scanner;

public class Multiplikation {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [][] A ;
		
		int [][] B ;
		
		System.out.println( "Jetzt wollen wir die Anzahl der Elemente unserer Arrays festlegen .");
		
		System.out.println( "Hier ist die Matrix  A : ");
		
		System.out.println( "geben sie die Größe der erste Spalte ein : ");
		
		int l = scan.nextInt() ;
		
		System.out.println( "geben sie die Größe der  zweite ein : ");
		
		int m = scan.nextInt() ;
		
		System.out.println( "Hier ist die Matrix  A : ");
		
		System.out.println( "geben sie die Größe der erste Spalte ein : ");
		
		int n = scan.nextInt() ;
		
		A= new int[l][m];
		
		System.out.println("Fügen wir die Element von A  hinzu ");
		
		for (int i = 0; i < A.length; i++) {
			
			for (int j = 0; j < A.length; j++) {
				
			A[i][j] = scan.nextInt();
			
			}
		}
		
		System.out.println("Fügen wir die Element von B  hinzu ");
		
		B= new int[m][n];
		
		for (int i = 0; i < B.length; i++) {
			
			for (int j = 0; j < B.length; j++) {
				
			B[i][j] = scan.nextInt();
			
			}
		}
		
		 int C[][] =  new int [l][m];
		 
		 for (int i = 0; i < C.length; i++) {
			
			 for (int j = 0; j < C.length; j++) {
				
				 C[i][j] = A[i][j]* B[j][i];
				 
				 System.out.println(C[i][j]);
			}
		}
		
	}
}
