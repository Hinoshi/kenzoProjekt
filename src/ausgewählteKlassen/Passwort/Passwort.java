package ausgewählteKlassen.Passwort;

import java.util.Scanner;

public class Passwort {

	Scanner keyboard = new Scanner(System.in);
	String password ;
	
	 public Passwort() {
		 
		  password = keyboard.next() ;
	}
	
	    
	    int score = 0; 
	
//	public int controll() {
//
//		if (password.length()>= 8) {
//			
//			summe +=1 ;
//			
//		
//					for(char c : password.toCharArray()) { // um in alle zeichen durchzugehen 
//						
//						if (Character.isUpperCase(c)|| Character.isLowerCase(c)) {
//							
//							summe ++ ;
//
//								if (Character.isDigit(c)) {
//									
//									summe ++ ;
//									
//									if (Character.isLetterOrDigit(c)) {
//										
//										summe ++ ; 
//										
//								}
//	
//							}			
//				
//						}
//
//					}
//					
//					return summe ;
//		}
//					 
//					
//			else {
//				
//				System.out.println(" Das Password muss  diese entsprechen .");
//				
//				return 0 ;
//			}
//	
	 
	 public int controll() {
		 
		    boolean hasUpper = false;
		    
		    boolean hasLower = false;
		    
		    boolean hasDigit = false;
		    
		    boolean hasSpecial = false;
		

		    if (password.length() >= 8) {
		    	
		        score++;
		        
		    }

		    for (char c : password.toCharArray()) {
		    	
		        if (Character.isUpperCase(c)) hasUpper = true;
		        
		        if (Character.isLowerCase(c)) hasLower = true;
		        
		        if (Character.isDigit(c)) hasDigit = true;
		        
		        if (!Character.isLetterOrDigit(c)) hasSpecial = true;
		        
		    }

		    if (hasUpper && hasLower) score++;
		    
		    if (hasDigit) score++;
		    
		    if (hasSpecial) score++;
		    

		    return score;
		}

	
	
	public static void main(String[] args) {
		
		Passwort pass = new Passwort(); 
		
		System.out.println( pass.controll());
		
		System.out.println( pass.password.length());
		
	}
}
