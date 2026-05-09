package stack;

public class queue{

	private  Node node ; 
	
	Node tail ; 
	
	Node head ; 
	
	static class Node {
		
		int data ; 
		
		Node next ; 
		
		public Node(int data ) {
			
			this.data = data ;
		}
	}
	
	 public void enter( int x) {
		 
		 Node newNode = new Node(x);

		 if (tail == null) {
			
			 tail =newNode ;
			 head=newNode ;
			 
		}
		 
		  tail.next =newNode   ; 
		 
		 tail = newNode ;
	 }
	 
//	 gibt den Inhalt des Objekts zurück und entfernt es aus der Schlange
	 
	 int leave() {
		 
		 if (head == null) {
			
			 throw new RuntimeException("Der Stack ist leer ");
		}
		 
		 int value = head.data ; 
		 
		 head = head.next ; 
		 
		 if (head == null) {
				
			tail = null ; 
		}
		 
		 return value ; 
	 }
	 
	 
	 public static void main(String[] args) {
		
		 queue que = new queue();
		
		 
		 que.enter(16);
		 
		 que.enter(32);
		 
		 System.out.println("der Stack ist : "+ que.leave());
		 System.out.println();
	}	
	
}
