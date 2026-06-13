package dateien_datenströme;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Copy {

	public static void main(String[] args) throws IOException {
		
		 File file2 = new File("C:\\Users\\joker\\eclipse-workspace\\KenzoProjekt\\src\\dateien_datenströme");
		 
		  if (!file2.exists()) {
			
			  file2.createNewFile();
			    
		}
		  
		  Path copy = Files.copy(Paths.get("C:\\Users\\joker\\eclipse-workspace\\KenzoProjekt\\src\\dateien_datenströme\\file2" ),
				  					
				  					Paths.get("C:\\Users\\joker\\eclipse-workspace\\KenzoProjekt\\src\\dateien_datenströme\\file" ));
		
		 
		   byte[] data = Files.readAllBytes(copy);
		   
		   Files.write(copy, data);
		   
		  System.out.println(copy);
		  
		System.out.println(System.getProperty("user.dir"));
	}
}
