package ausgewälteKlasse.klasseVector;

import java.util.Iterator;
import java.util.Vector;

public class Lernen {

	 String buchname ; 
	 
	 int Anzahlfaecher ; 
	 
	 int groupelernen ; 
	 
	 public Lernen( String buchname ,int Anzahlfaecher ,int groupelernen  ) {
		 
		 this.Anzahlfaecher = Anzahlfaecher ; 
		 
		 this.buchname = buchname ; 
		 
		 this.groupelernen = groupelernen ; 
		 
	}
	 
	 public String getBuchname() {
		 return buchname;
	 }

	 public void setBuchname(String buchname) {
		 this.buchname = buchname;
	 }

	 public int getAnzahlfaecher() {
		 return Anzahlfaecher;
	 }

	 public void setAnzahlfaecher(int anzahlfaecher) {
		 Anzahlfaecher = anzahlfaecher;
	 }

	 public int getGroupelernen() {
		 return groupelernen;
	 }

	 public void setGroupelernen(int groupelernen) {
		 this.groupelernen = groupelernen;
	 }
	 
	 @Override
	public String toString() {
		
		return " ich werde " + getAnzahlfaecher() + " besonders "+ getBuchname()  + " in der groupe" + getGroupelernen();
	}
	 
	 public static void main(String[] args) {
			
		 Vector<Lernen> lernen = new Vector<>();
		 
		 lernen.add(new Lernen("kenzo", 2, 4));
		 
		 lernen.add(new Lernen("kenzo", 2, 3));
		 
		 lernen.add(new Lernen("kenzo", 2, 4));
		 
		 lernen.add(new Lernen("kenzo", 2, 46));
		 
		 lernen.add(new Lernen("kenzo", 2, 434));
		 
		 lernen.add(new Lernen("kenzo", 2, 4));
		 
		  System.out.println();
		 
		 for(Object obj : lernen) {
			 
			 System.out.println( obj.toString());
		 }
	 
	 }
}
