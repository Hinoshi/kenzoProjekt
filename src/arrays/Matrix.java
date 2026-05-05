package arrays;

public class Matrix {

	public static void main(String[] args) {
		
		int matrix[][] = new int [20][20];
		
		for (int i = 0; i < matrix.length; i++) {
			
			for (int j = 0; j < matrix.length; j++) {
				
				 matrix[i][j] = i*j;
				 
				 System.out.println("Zeile " + i + "*"+ j + " : " + matrix[i][j] );
				 	
			}
			
			System.out.println("\n");
			
		}
	}
}
