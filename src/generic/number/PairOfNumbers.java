package generic.number;

import generic.pair.Pair;

public class PairOfNumbers< T extends Number , U extends Number> extends Pair<T, U> {
	
	T a ; 
	
	U b ; 
	
	public PairOfNumbers(T a , U b ) {
		
		super(a,b);
	}
	
	double doublevalue () {
		
		return (double) (getA().doubleValue() + getB().doubleValue());
	}

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}

	public U getB() {
		return b;
	}

	public void setB(U b) {
		this.b = b;
	}


}
