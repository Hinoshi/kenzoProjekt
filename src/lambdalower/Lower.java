package lambdalower;

import java.util.ArrayList;

public class Lower {

public static void main(String[] args) {
	
	ArrayList< String > list = new ArrayList<>() ; 
	
	list.add("Demain") ; 
	
	list.add(" je " ) ; 
	
	list.add("Viendrai ") ; 
	
	list.forEach(s -> System.out.println(s.toLowerCase()));

	}
}
