package programmiz.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Beispiel_fileInputStream {

	public static void main(String[] args) throws IOException {
		
		File file = new File("kenzo.tx");
		
		 String ken = "demain est un mot anglais ";
			byte [] k = ken.getBytes();
		
		boolean filetest = file.createNewFile();
		
		
		if (filetest) {
			
			System.out.println("Die File wurde erstellt");
		
		}else {
			
			System.out.println( "Wir haben die File erstellt");
		}
		
		FileOutputStream test2 = new FileOutputStream(file);
		
		test2.write(k);
		
		test2.flush();
		
		test2.close();
		
		System.out.println("Available bytes at the end : " );
		
		FileInputStream test = new FileInputStream(file);
		
		test.read();
		test.read();
		test.read();

		System.out.println("Available bytes at the end : " +test.available());
		
		// jetzt testen wir die mögliche Available 

		test.close();
	}
}
