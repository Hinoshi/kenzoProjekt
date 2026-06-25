package nebenläufigkeitProgrammierung;


public class Erzeugung implements Runnable {

	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
		
		for (int i = 0; i < 10; i++) {
			
			 try {
				
				 Thread.sleep(1000);
				 
			} catch (InterruptedException e) {
				
				e.getCause() ; 
			}
		
			 System.out.println( name + " : " + i );
		}
		
		System.out.println(name + "Ich bin fertig .");
		
	}
	
	public static void main(String[] args) {
		
	Thread test1 = new Thread( new Erzeugung());
	Thread test2 = new Thread(  new Erzeugung());
	
	test1.start();
	
	test2.start();
		
		
	}

}
