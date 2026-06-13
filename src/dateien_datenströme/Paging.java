package dateien_datenströme;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Paging {
//
//	public static void main(String[] args) throws IOException {
//		
//		 File file = new File("C:\\Users\\joker\\eclipse-workspace\\KenzoProjekt\\src\\dateien_datenströme\\file1");
//		
//		  if (!file.exists()) {
//			
//			  file.createNewFile();
//		}
//		  
//		FileInputStream file1 = new FileInputStream(file) ; 
//		
//		file1.read() ; 
//		
//		FileOutputStream file4 = new FileOutputStream(file);
//		
//		file4.write(10);
//		
//		 System.out.println(file1.toString());
//		 
//		 System.out.println(file4);
//		 
//		  BufferedInputStream fil = new BufferedInputStream(file1); 
//		  
//		  System.out.println(fil);
//	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		 File file1 = new File("C:\\Users\\joker\\eclipse-workspace\\KenzoProjekt\\src\\dateien_datenströme\\file1") ;
		 
		 if (!file1.exists()) {
				
				  file1.createNewFile();
			}
		 try (BufferedReader br = new BufferedReader(new FileReader(file1))){
			 
			  String line ; 
			  
			  int count = 0 ; 
			  
			  while((line= br.readLine())!= null) {
				  
				  System.out.println(line);
				  
				  count++ ;
				  
				  if (count%10==0) {
					
					  System.out.println("weiter");
					  
					  System.in.read();
				}
			  }
		 }
	}
}
