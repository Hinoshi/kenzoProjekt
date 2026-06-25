package nebenläufigkeitProgrammierung;

public class Erzeugen_starten_beenden extends Thread{

	// erzeugung von der Threads

	
	@Override
	public void run() {

		String name = getName();
		
		for(int i = 0 ; i<3 ; i ++) {
			
			try {
				
				Thread.sleep(1000);
				
			} catch (InterruptedException ignored) {
				
			}
			
			System.out.println(name + ": " +i);
		}
		System.out.println(name+ ": ich bin fertig!");

		super.run();
	}
	
	public static void main(String[] args) {
		
		Erzeugen_starten_beenden test1 = new Erzeugen_starten_beenden();
		Erzeugen_starten_beenden test2 = new Erzeugen_starten_beenden() ; 
		
		test1.start();
		test2.start();
	}

}
