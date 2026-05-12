package exam.prog2.soe25_01.container;

public class QueueList <T> implements Queue<T>{

	
	T data  ; 
	
	Node <T> node ; 
	
	Node <T> tail ; 
	
	
	
	public class Node <T>{
		
		T data ; 
		
		Node <T> next ; 
		
		public Node(T data) {
			
			this.data = data ; 
		}
	}
	
	@Override
	public void pusch_front(T elem) {
		
		Node <T> newNode =  new Node<>(elem);
		
		newNode.next = node ; 
		
		node =  newNode ; 
		
	}

	@Override
	public T Pop_back() {
		
		if (node == tail) {
			
			T value = node.data ;
			
			node  = tail = null ; 
			
			return value ; 
		}
		
		Node <T> current = node ; 
		
		while(current.next != tail) {
		
		current = node.next ; 
		
		}
			
		T value = tail.data ; 
		
		tail = current ; 
		
		tail.next = null ; 
		
		return value  ;
	}

	@Override
	public boolean empty() throws EmptyQueueExeption {
		
		if (empty()) {
			
			throw new EmptyQueueExeption("Der Queue is leer");
		}
		return false;
	}
	


}
