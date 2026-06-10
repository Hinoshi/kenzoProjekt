package lambdalower;

import java.util.ArrayList;

public class Methode_ref {

	 public static <E> void main(String[] args) {
		
		 ArrayList<Integer> list = new ArrayList<>() ; 
		 
		 list.add(12) ;
		 list.add(123) ;
		 list.add(124) ;
		 list.add(125) ;
		 list.add(126) ;
		 list.add(1278) ;
		 
		  list.forEach((s) -> System.out.println(s)); // das ist ein Lamda
		  
		 
		  list.forEach(System.out:: println); // das ist eine methodereferenz
		 
		 
	}
}
