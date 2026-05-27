package ausgewählteKlassen.Passwort;

public class IntegerStack implements Cloneable {

	
	int [ ]list ; 
	
	int  size = 0  ;
	
	private int  laenge ; 
	
	
	 public IntegerStack(int laenge ) {
		 
		  list = new int [laenge] ; 
		 
	}
	
//	public int[] getList() {
//		return list;
//	}
//
//	 public void setList(int[] list) {
//		 this.list = list;
//	 }
//
//	 public int getSize() {
//		 return size;
//	 }
//
//	 public void setSize(int size) {
//		 this.size = size;
//	 }

	public void push(int value) {
		
		if (size == list.length) {

			throw new RuntimeException("List ist leer");
		}
		
		list[size] = value;
		
		size++ ; 
				
				
	}
	
	public int pop() {

		if (size ==0) {
			
			throw new RuntimeException("List ist leer");
		}
		
		for (int i = 0; i <size-1; i++) {
			
			list [i]=list[i+1];
			
		}
		
		size-- ;
		
		
		for(int valu : list) {
			
			System.out.println(valu);
		}
		
		return list[size];
		
	}
	
	@Override
	
	public  Object clone() throws CloneNotSupportedException {
		
		IntegerStack copy = (IntegerStack) super.clone() ;
		
		copy.list = list.clone();
		
		return copy ;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		IntegerStack in = new IntegerStack(12);
		
		
		
		in.push(12);
		
		in.push(34);
		
		in.push(456);
		
		System.out.println(in.pop());
		
		System.out.println(in.pop());
		
		
		IntegerStack copy = (IntegerStack) in.clone();
		
		copy.push(243);
		
		System.out.println(in.pop());
		
		System.out.println(copy.pop());
	}
	
}
