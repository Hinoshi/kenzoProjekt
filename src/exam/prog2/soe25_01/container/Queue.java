package exam.prog2.soe25_01.container;

public interface Queue <T>  {

	void pusch_front( T elem) ;
	
	T Pop_back() ;
	
	boolean empty() throws EmptyQueueExeption;
	
	 default void clear() {
		 
		try {
			while (!empty() ){
				
				 Pop_back();
			}
		} catch (EmptyQueueExeption e) {
			
			e.printStackTrace();
		}
		 
	 }
}
