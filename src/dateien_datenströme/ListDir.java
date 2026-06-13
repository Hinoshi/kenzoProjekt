package dateien_datenströme;

import java.io.File;
import java.io.FileFilter;

public class ListDir {

	 public static void main(String[] args) {
		 
		  String file = System.getProperty("user.dir") ; 
		  
		  File  fille = new File(file);
		  
		  File [] list = fille.listFiles();
		  
		  for( File liste : list ) {
			  
			  System.out.println( liste);
			  
		  }
		  
		  
	}
}
