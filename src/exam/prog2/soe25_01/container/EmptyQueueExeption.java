package exam.prog2.soe25_01.container;

public class EmptyQueueExeption  extends Exception{

	public EmptyQueueExeption() {
		
	}
	
	public EmptyQueueExeption(String message){
		
		super(message);
	}
}
