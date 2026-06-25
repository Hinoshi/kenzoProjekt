package programmiz.java.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamBeispiel {

	public static void main(String[] args) throws IOException {
		
		String prüfung = "ICh werde alle meine Prüfungen bestehen";
		
		try {
			OutputStream output = new FileOutputStream("input.txt");
		
			// Konvertierung der Data in bytes 
			
			byte[] data = prüfung.getBytes();
			
			// Schreiben wir die Data  in der OutputStream 
			
			 output.write(data);
			 
			 System.out.println("Die Nachricht über die Prüfung wurde in der File geschrieben.");
		
			 output.close();
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
