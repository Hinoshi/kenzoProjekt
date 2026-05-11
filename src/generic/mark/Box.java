package generic.mark;

public class Box <T> implements Markable<T> {
	private Object value;
	
	protected  T mark ; 

	public void setValue(Object value) {
		this.value = value;
	}

	public Object getValue() {
		return value;
	}

	@Override
	public void setMark(T m) {
		
		this.mark = m ; 
		
	}

	@Override
	public T getMark() {
		
		return mark;
	}
}
