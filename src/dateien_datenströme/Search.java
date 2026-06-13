package dateien_datenströme;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Search {
//
//	 static void list () {
//		 
//		 Path path = Paths.get("user.dir");
//		 
//		 Path base = Paths.get("user.dir");
//		 
//		 Path file = Paths.get("user.dir");
//		 
//		 System.out.println(base.relativize(file)); // Ausgabe: Projekt/Main.java
// 
//	 }
//	 
	  public static void main(String[] args) throws IOException {
		  
		  Path start = Paths.get("C:\\Users\\joker\\eclipse-workspace\\KenzoProjekt\\src\\");
		  
		   // alle Java Dateien finden 
		  
		   try (var stream   = Files.walk(start)) {   
			 
			   stream.filter(p -> p.toString().endsWith(".java")).forEach (p->System.out.println(start.relativize(start)));
			 	
		}
		   try(var stream  = Files.walk(start)){
			   
			    long count = stream.filter(p -> p.toString().endsWith(".java")).count() ; 
			    
			    System.out.println("Gesamt Dateien : " +count);
		   }
		   
		   try(var stream = Files.walk(start)){
			   
			   long size= stream.filter(p-> p.toString().endsWith(".java")).mapToLong(p->p.toFile().length()).sum();
			   
			   System.out.println("Gesamtgröße : " +size + "bytes");
		   }
	}
}
