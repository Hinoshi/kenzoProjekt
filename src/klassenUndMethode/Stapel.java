package klassenUndMethode;

public class Stapel {
	
	
	private int [] zahl = new int[1]; // Startkapazität
	
	private int top = 0 ;  // anzahl der Elemente in Stack
	
	private Node node ;
	
	static class Node{
		
		int data ; 
		
		 Node next ; 
		 
		 public Node(int data) {
			
			 this.data= data;
		}
	}
	

	public void push(int e) {
		
		Node newNode = new Node(e);
		
		newNode.next= node ; 
		
		 node = newNode ; 

	}
	
	public  int pop() {

			
		if (node == null) {
			
			throw new RuntimeException("der Stack ist leer ");
			
		}
		
		int value  = node.data ; 
		
		node = node.next ; 
		
		return value ; 
	}
	
	public static void main(String[] args) {
		
		
		Stapel stap = new Stapel();
		
		stap.push(23);
		
		stap.push(10);
		stap.push(20);
		stap.push(30);
		stap.push(40);   // hier wird das Array automatisch verdoppelt


        System.out.println("pop: " + stap.pop());
        System.out.println("pop: " + stap.pop());


	}
}
