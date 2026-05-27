package ausgewählteKlassen.Passwort;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class Mailadressen {

	private String  name  ; 
	
	public Mailadressen( String name ) {
		
		this.name = name ; 
		
		
	}
	
	public String getMail(String name) {
		
		Properties p = new Properties() ; 
		
		return p.getProperty(name);
	}
	
	public static void main(String[] args) throws IOException {
		
		Properties p = new Properties() ; 
		
		p.getProperty(" Der Schlüssel existiert nicht");
		
		FileInputStream file = new FileInputStream("C:\\Users\\joker\\eclipse-workspace\\KenzoProjekt\\src\\ausgewählteKlassen\\Mailadresse.txt");

		p.load(file);
		
		file.close();
		
		Enumeration key = p.propertyNames(); 
		
		while (key.hasMoreElements()) {
			
			String ke = (String)key.nextElement() ; 
			
			String value = p.getProperty(ke);
			
			System.out.println(ke + " = " + value );
			
			
		}
		
		p.put(file, "kaidjeu12junior@gmail.com");
		
		p.put(file, "meri@das@gmail.com");
		
		
		
		
//		p.store(in, " es gibt kien value ");
	}
}
