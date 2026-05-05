package verebung.konstruktion;

public class B extends A{

	private A a ; 
	
	public B() {
		
		a = new A() ; 
		
		m();
	}
	
	public void m () {
		
		a.m();
		
		System.out.println("m  aus B");
	}
	
	public static void main(String[] args) {
		
		 new B();
	}
}
// ein NullPointerException wird hier erschienen , weil  this.a null ist