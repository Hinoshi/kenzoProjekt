package generic.pair;

public class Pairtest {

	public static void main(String[] args) {
		
		Pair<Integer, String> pair = new Pair <>();
		
		Pair<Integer, String> pair2 = new Pair <>(123 , "Kenzo");
		
		pair.setValue(134) ; 
		
		pair.setWert("Kenzo");
		
		System.out.println(" Morgen wird " +pair.getWert() +" " + pair.getValue() +" alt sein .");
		
		System.out.println(pair2);
	}
}
