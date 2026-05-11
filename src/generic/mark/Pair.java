package generic.mark;

public class Pair<T, U> implements Markable<String> {
	
	protected T value ; 
	
	protected U wert ;
	
	protected String mark ;  
	
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

	@Override
	public void setMark(String m) {
		
		this.mark = m ; 
		
	}

	@Override
	public String getMark() {
		
		// TODO Auto-generated method stub
		return mark;
	}
}
