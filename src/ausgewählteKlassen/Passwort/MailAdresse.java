package ausgewählteKlassen.Passwort;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Properties;

public class MailAdresse {

	 private final Properties p = new Properties();
	 
	 public MailAdresse(String  mail) throws IOException {

		 FileInputStream in = new FileInputStream(mail) ;
		 
		 p.load(in);
		 
		 in.close();
	}
	 
	 public String  getMailAdresse(String name) {
		 
		 return p.getProperty(name);
	 }
	 
	 public String[] name() {
		 
		 
		 String namen [] = new String[p.size()];
		 
		 Enumeration<?> e = p.propertyNames();
		 
				 int i = 0 ; 
				 
				 while(e.hasMoreElements()) {
					 
					 namen[i]= (String) e.nextElement();
					 
					 i++ ;
				 }
				 
				 return namen ; 
	 }
	 
	 @Override
	public String toString() {
		
		 return Arrays.toString(name());
	}
	 
	  public static void main(String[] args) throws IOException {
		
		  MailAdresse mail = new MailAdresse("C:\\Users\\joker\\eclipse-workspace\\KenzoProjekt\\src\\ausgewählteKlassen\\Passwort\\Mailadresse1.txt");
		  
		  mail.getMailAdresse("Kenzo=kaidjeu12junior@gmail.com");
		  
		  mail.getMailAdresse("Meri=meri@das@gmail.com");
		  
		  mail.getMailAdresse("Joker=joker@example.com");
		  
		  mail.getMailAdresse("Kenzo=kaidjeu12junior@gmail.com\r\n"
		  		+ "Meri=meri@das@gmail.com\r\n"
		  		+ "");
		  
		  
		  System.out.println(Arrays.toString(mail.name()));
	}
	 
}
