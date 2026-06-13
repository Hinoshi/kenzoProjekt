package dateien_datenströme;

import java.io.File;

public class RekursivListDir {

	public static void main(String[] args) {
		
		 String file = System.getProperty("user.dir") ; 
		 
		 File root = new File(file); 
		 
		  list(root) ; 
		 
	}
	 static void list(File dir) {
		 
		 File [] files  = dir.listFiles();
		 if (files != null) {
			
			 for(File f : files) {
				 System.out.println( f);
				 
				  if (f.isDirectory()) {
					
					  list(f) ; 
				}
			 }
		}
	 }
}
