package nebenläufigkeitProgrammierung;

public class Daemontest implements Runnable {

	@Override
	public void run() {

		String name = Thread.currentThread().getName();
		
		System.out.println("Start run : ");
		
		try {
			 
			Thread.sleep(5000);
			
		} catch (InterruptedException e) {
			
			
		}
		
		for(int i = 0 ; i < 10 ; i++ ) {
			
			System.out.println(name + " : " + i );
		}
		
		System.out.println("Ende run");
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread p = new Thread(new Daemontest());
		
		p.setDaemon(true);
		
		p.start();
		
		Thread.sleep(2000);
		
		System.out.println("Ende main");
	}

}
