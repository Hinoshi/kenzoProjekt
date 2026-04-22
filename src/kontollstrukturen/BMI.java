package kontollstrukturen;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Schreiben wir ein programm , das der BMI von einem Mench berechnet .");
		
		System.out.println("Geben  sie Ihr Gewicht hier ein : ");
		
		 double gewicht = scan.nextDouble();
		 
		 System.out.println("Geben sie Ihre Groesse hier ein : ");
		 
		  double  groesse = scan.nextDouble();
		  
		  double bmi = gewicht/ (groesse  *groesse);
		  
		  System.out.println("Ihr BMI ist : " +bmi);
		  
		  if (bmi<18.5) {
			
			  System.out.println("Sie sind Untergewicht .");
			  
		}else if (bmi >= 18.5 && bmi <25) {
			
			System.out.println("Sie sind Normalgewicht");
			
		}else if(bmi >=25 && bmi <30) {
			
			System.out.println( "Sie sind Übergewicht");
			
		} else if(bmi >=30) {
			
			System.out.println("Sie sind Adipositas");
		}
		
	}
}
