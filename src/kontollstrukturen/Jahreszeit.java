package kontollstrukturen;

import java.util.Scanner;

public class Jahreszeit {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println( "Geben Sie ein Monat hier ein : ");
		
		String  monat = scan.next();
		
		switch (monat ="Januar") {
		
		case "Februar","Dezember","Januar":
			
			System.out.println( "dieser Monat entspricht  den Winter ");
			break;
			
		case "März","April","Mai":
			
			System.out.println( "dieser Monat entspricht  den Frühling " );
			
		break ;
		
		case "Juni","Juli","August":
			
			System.out.println( "dieser Monat entspricht  den Frühling " );
			
		break ;

		default:
			
			System.out.println("Sind sie im Sommer");
			
			break;
		}
	}
}
