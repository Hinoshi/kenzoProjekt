package exception;

public class Random  {
	
	
	
	public static void main(String[] args)  throws Exception{
		
		try {
			
			int zufall= (int)(Math.random()*100);
			
			if (zufall==0) {
				
				throw new Exception("Der Zahl ist gleich null");
			}
		
			System.out.println(zufall);
			
		} catch (Exception e) {

			System.out.println("der Fehler : " +e.getCause());
			
			System.out.println("der Fehler : " +e.getMessage());

		}

	}
}
