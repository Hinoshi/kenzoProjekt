package programmiz.java.io;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamBeispiel {

	public static void main(String[] args) {
		
		 byte [] ken =  new byte [100] ; 
		 
		try {
			
			InputStream  input = new FileInputStream("input.txt");
			
			System.out.println("Availaible Byte in der File " + input.available());
			
			
			// read byte from the input stream 
			
			input.read(ken);
			
			System.out.println( "Data read from the file ");
		
			// convert byte array into string 
			String data = new String(ken);
			
			System.out.println(data);
			
			// close the inputstream
			
			input.close();
			
		} catch (Exception e) {
			e.getStackTrace();
			e.getCause();
		}
		
	}
}
