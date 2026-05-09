package exception;

public class Array {

	int array [];
	int  lengh ; 
	
	public Array(int lenght ) throws OutOfMemoryError {
		
		this.lengh = lenght;
		
		array = new int [lengh];

	}
	
	public int []value () {
		
		int arr [] = array ; 
		
		for (int i = 0; i < array.length; i++) {
			
			arr[i]= array[i];
		}
		
		array = arr ;
		
		return  array ; 
	}
	
	public static void main(String[] args) {
		
		Array arrr = new Array(123);
		
		int jun[]=arrr.value();
		
		for(int aa : jun) {
			
			System.out.println(aa);
			
		}
	}
}
