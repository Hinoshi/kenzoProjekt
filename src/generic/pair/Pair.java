package generic.pair;

public class Pair<T, U> {
	
	protected T value ; 
	
	protected U wert ;
	
	public Pair() {
		
	}
	
	public Pair(T value  , U wert) {
		
		this.value = value ; 
		
		this.wert = wert ; 
		
		
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public U getWert() {
		return wert;
	}

	public void setWert(U wert) {
		this.wert = wert;
	}

	@Override
	public String toString() {
	
		
		return "(" +value + "," +wert +")";
	}
}
