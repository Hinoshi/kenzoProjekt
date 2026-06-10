package lamda.ausdrücke;

import java.util.Comparator;

public class Lamdabeispiel {

	public static void main(String[] args) {
		
		// comparator ist ein Interface 

		Comparator<String> stringComparator = new  Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
//				if (!o1.equals(o2)) {
//					
//					return 1 ; 
//				}
//				return 0;
				
				 // statt diese zu nutzen kann man auch diese nutzen 
				
				return o1.compareTo(o2);
			}
		};

		System.out.println( stringComparator.compare("Hello", " World") );
		
		
		 Comparator<String > LamdaExpression =
				 
				 (String o1 , String o2) -> {return o1.compareTo(o2) ;};
				 
				
				 
				 System.out.println( LamdaExpression.compare("Hello", " World") );
				 
				 
				 // wir können auch es so schreiben 
				 
				 
				 Comparator<String > LamdaExpression2 =
						 
						 (String o1 , String o2) ->  o1.compareTo(o2) ;
						 
						 System.out.println( LamdaExpression2.compare("Hello", " World") );
		
						 
						 
						 MyFunction myFunction = text ->System.out.println(text);
						
						 myFunction.apply("Helloworld");
						 
//						 System.out.println(myFunction.toString());
						
	}
}
