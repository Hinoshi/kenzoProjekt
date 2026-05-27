package ausgewählteKlassen.warenkorb;

import java.util.Arrays;
import java.util.Vector;

public class Woerter {

	public static String[] extract(String text, String delim) {
		
		 Vector <String> vec = new Vector<>() ; 
		 
		 
		 //Die String-Methode split zerlegt eine Zeichenkette in ein Array anhand eines Suchmusters:
		 
		 String [] part = text.split(delim) ; 
		
		// Wörter in den Vektor hinzufügen 
		 
		 for( String word : part) {
			 
			 if (!word.isEmpty()) {
				
				 vec.add(word.trim()); // Trim entfernt  Leerzeichen 
			}
		 }
		 
		 
		 
		 // vector in Array Umwandeln
		 
		 String []result = new String[vec.size()] ; 
		 
		 vec.copyInto(result);
		 
		 // Array sortieren 
		 
		 Arrays.sort(result);
		 
		  return result ;
		  
	
	}
	
	 public static void main(String[] args) {
		
		  String text = "Demain je viendrais a l ecole manger " ; 
		  
		  String [] word = extract(text, " ");
		  
		  System.out.println(Arrays.toString(word));
		  
	}

}
