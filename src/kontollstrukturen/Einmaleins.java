package kontollstrukturen;

public class Einmaleins {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			for (int j = 0; j <10; j++) {
				
				int multi = i*j ;
				
				System.out.println( i +"*"+j+"=" +multi);
			}
		}
	}
}
