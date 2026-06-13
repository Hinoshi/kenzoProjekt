package streams;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lernen {

	public static void main(String[] args) {
		
		List<Integer> list  = List.of(1 ,2,3,4,5,6,7,8,9,9) ; 
		list.stream().limit(5).forEach(System.out:: println);
		
		System.out.println("Stream : ");
		
		Integer[] a = {1 ,2,3,4,5,6,7,8,9,9}; 
		
		Stream.of(a).limit(5).forEach(System.out:: println);
		
		System.out.println("iterate");
		
		Stream.iterate(1, n->n+1).limit(7).forEach(System.out:: println);
		IntStream.iterate(1, n -> n+2).limit(10).forEach(System.out:: println);
		
		System.out.println("math");
		
		Stream.generate(Math::random).limit(12).forEach(System.out:: println);
		
		
//		System.out.println(list.stream().count() );
	}
	 
}
