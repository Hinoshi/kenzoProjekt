package vererbung.obstlager;

public class TestObstlager {
	
	public static void main(String[] args) {
	
		 Obst[] obst = new Obst[3];
		 
		 obst[0] = new Apfel("Apfel", "Rot");
		 
		 obst[1]= new Orange("Orange" , "Orange");
		 
		 obst[2]= new Birne("Birne" , "grün");
		 
		 for(Obst ob : obst) {

			 System.out.println("das ist ein " +ob.getFarbe()+" mit der Farbe "+ob.getName()  );
		 }
	}
}
