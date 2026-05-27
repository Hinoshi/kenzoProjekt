package ausgewählteKlassen.rechner;

//import java.io.InputStream;
//import java.io.PrintStream;

public class Standarddatenströme {

	
//	public static final InputStream in ; 
//	
//	public static final PrintStream out ; 
//	
//	public static final PrintStream err ;
//	
	public static void main(String[] args) {
		
		System.out.println(System.currentTimeMillis() / 1000 + " sekunden" );
		
		System.out.println(System.nanoTime());
		
//		System.out.println(System.in);
		
		System.out.println(System.getenv("Windows"));
		
		String s = "";
		Class c = s.getClass();
		
		System.out.println(c);
	}

}
