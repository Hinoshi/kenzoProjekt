package dateien_datenströme;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.io.IOException;

public class Dateien {


	public static void main(String[] args) throws IOException {
		
		String current = System.getProperty("user.dir");
		
		System.out.println(current);
		
		String home = System.getProperty("user.home");
		
		System.out.println(home);
		
		String tmp = System.getProperty("java.io.tmpdir");
		
		System.out.println(tmp);
		
		 File file = new File( "C:\\Users\\joker\\eclipse-workspace\\KenzoProjekt\\src\\dateien_datenströme", "file");
			
		 System.out.println(file.getName());
		 System.out.println(file.getPath());
		 System.out.println(file.getParent());
		 System.out.println(file.exists());
		 System.out.println(file.canRead());
		 System.out.println(file.canWrite());
		 System.out.println(file.isFile());
		 
		 System.out.println(file.createNewFile());

		 System.out.println(new File("C:\\\\Users\\\\joker\\\\eclipse-workspace\\\\KenzoProjekt\\\\src\\\\dateien_datenströme\\\\kenzo").createNewFile());
		 
		
		 
		  FileInputStream fiele = new FileInputStream(file) ;
		  
		  System.out.println(fiele);
		 
		  System.out.println( fiele.read());
		  
		  BufferedInputStream fielle = new BufferedInputStream(fiele);
	
	}
}
