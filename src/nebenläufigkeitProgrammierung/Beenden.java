package nebenläufigkeitProgrammierung;

import java.io.IOException;

public class Beenden extends Thread{

	@Override
	public void run() {
		
		String name = getName() ; 
		
		
		while(true) {
			
			try {
				
				Thread.sleep(3000);
				
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			
			 for(int i = 0 ; i <5 ; i ++ ) {
				 
				 System.out.println(name +" : " + i );
			 }
		}
		
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Beenden be = new Beenden() ; 
		
		be.start();
		
		 System.in.read();
		 
		 be.interrupt();
		 
		 be.join();
		 
		 System.out.println("Elerdigt");
	}
}
