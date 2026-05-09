package Interface.list;

public interface IntergerList {
	
	// liefert die laenge der Liste 
	
	abstract int getlength();
	
	// Fügt value am ende der Liste ein 
	
	abstract void insertLast(int value);
	
	// liefert das erste Element der Liste
	
	abstract int getFirst();
	
	// Löscht das ertste Element der Liste
	
	abstract void deletefirst();
	
	// Prüft , ob value in der Liste vorhanden ist 
	
	abstract boolean search(int value);
}
