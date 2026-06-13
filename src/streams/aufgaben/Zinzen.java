package streams.aufgaben;

import java.util.List;

public class Zinzen {

	static Guthaben gut ; 
	
	 public static void main(String[] args) {
		 
		gut.zinzen(1.5);
		
		 List<Guthaben> list = List.of( new Guthaben(1278) , new Guthaben(12456), new Guthaben(12265), new Guthaben(12562) ) ; 
		 list.stream().limit(3).forEach( System.out::println);
		 
	 
	 }
}
