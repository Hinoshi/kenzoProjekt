package Interface.list;

public class ArrayIntergerList implements IntergerList {

	private int list [] ;
	
	int size= 0;
	
	public ArrayIntergerList( int laenge) {
		
		list  = new int [laenge];
		
	}
	
	@Override
	public int getlength() {
		
		return size;
	}

	@Override
	public void insertLast(int value) {
		
		if (size == list.length) {
			
			throw new RuntimeException("List ist voll");
		}
		
		list[size]=value ; 
		
		size++;
		
	}

	@Override
	public int getFirst() {
		
		if(size == 0 ) throw new RuntimeException("list ist leer");
		
		return list[0];
	}

	@Override
	public void deletefirst() {
		

		
//		int [] newarray = new int [list.length-1];
//		
//		// ein element zu löschen 
//		
//		System.arraycopy(list, 1, newarray, 0, list.length - 1);
//		

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
	}

	@Override
	public boolean search(int value) {
		
		for(int i = 0 ; i <size ; i++) {
			
			if (list[i] == value) {
				
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		ArrayIntergerList list = new ArrayIntergerList(2);
//
//		System.out.println(array.getlength());
//		
//		array.insertLast(12);
//		array.insertLast(11);
//		
//		System.out.println(array.getlength());
//		
//		System.out.println(array.getFirst());
		

        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);

        System.out.println("Länge: " + list.getlength());
        System.out.println("Erstes Element: " + list.getFirst());

        System.out.println("Suche 20: " + list.search(20));
        System.out.println("Suche 99: " + list.search(99));

        list.deletefirst();
        System.out.println("Erstes Element nach delete: " + list.getFirst());
        System.out.println("Neue Länge: " + list.getlength());
    
	}

}
