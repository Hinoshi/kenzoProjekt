package Interface.displayable;

import klassenUndMethode.Sparbuch;

public class Utilities {
	
	private static int nummer ; 

	public static void display(Displayable a) {
		
		nummer ++ ; 
		
		a.display();
	}
	
}
