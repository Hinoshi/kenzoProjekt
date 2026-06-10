package lambdalower;

import java.util.Comparator;
import java.util.Arrays;

public class Sort {
	 public static void main(String[] args) {
		
	 String []  arr   = {"demain" , "je" , "viendrai" , "Boire" , "de l eau"} ;
		 
		 Arrays.sort(arr,(s1,s2) -> Integer.compare(s1.length(), s2.length()));
		 
		 for(String s : arr) {
			 System.out.println(s);
		 }
	}

	 
	static <T> void sort(T[] a , Comparator<? super T> c) {
	 
		
	}
	
}
