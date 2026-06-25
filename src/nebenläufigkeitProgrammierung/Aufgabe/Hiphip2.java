package nebenläufigkeitProgrammierung.Aufgabe;

public class Hiphip2 extends Thread {

	@Override
	public void run() {

		String hip = Thread.currentThread().getName();
		
		String hop = Thread.currentThread().getName();
		try {
			
			Thread.sleep(1200);
			
		} catch (InterruptedException e) {
			
		}
		for(int i = 1 ; i>=0 ; i++) {
			
			 System.out.println( hip + " "+" : " + i );
		}
		
		try {
			
			Thread.sleep(1200);
			
		} catch (InterruptedException e) {
			
		}
		for(int i = 1 ; i>=0 ; i++) {
			
			 System.out.println( hop + " "+" : " + i );
		}
		
		System.out.println(hip + ": ich bin fertig ");
		
		
	}
	
	
	public static void main(String[] args) {
		
		Hiphip2  test  = new Hiphip2() ; 
		
		test.start();
		
	}
}
