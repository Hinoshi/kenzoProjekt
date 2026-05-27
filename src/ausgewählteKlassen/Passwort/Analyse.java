package ausgewählteKlassen.Passwort;

import java.util.Scanner;

public class Analyse {

	
	 Scanner keyboard = new Scanner(System.in);
	 
	   String word  = keyboard.nextLine() ; 
	   
	   int score = 0 ; 
	 
	 public Analyse(String word ) {

		 this.word = word ;
		 
	}
	 
	 public Analyse() {
		// TODO Auto-generated constructor stub
	}
	 
	 public  int  überprüfung () {
		 
		 int kleinbuchstaben = 0 ;
		 
		 int großbuchstaben = 0 ; 
		 
		 int leerzeichen = 0 ; 
		 
		 int sonstiges  = 0 ;
		 
		 
		 for(char c : word.toCharArray()) {
			 
			 if (Character.isLowerCase(c)) {
				
				 kleinbuchstaben++ ; 
				 				
			}
			 
			 if (Character.isUpperCase(c)) {
				 
				 großbuchstaben++ ;
		 
			}
			 
			 if (!Character.isLetterOrDigit(c)) {
	 
				 sonstiges++ ;
			}
			 
			 if (Character.isWhitespace(c)) {
 
				 leerzeichen++ ;
			}
			 

		 }
		 System.out.println(" Wir haben genau " + kleinbuchstaben +" Kleinbuchstaben");
		 
		 System.out.println(" Wir haben genau " + großbuchstaben +" Großbuchstaben");
		 
		 System.out.println(" Wir haben genau " + sonstiges +" Sonstiges");
		 
		 System.out.println(" Wir haben genau " + leerzeichen +" Leerzeichen");
		 
		 score = kleinbuchstaben+ großbuchstaben+ leerzeichen + sonstiges ; 
		 
		 System.out.println(" Wir haben Gesamt " + score +" ");
		 
		 return score ;
	 }
	 
	 public static void main(String[] args) {
		
		 
		 Analyse an = new Analyse() ;
		 
		 System.out.println(an.überprüfung());
	}
}
