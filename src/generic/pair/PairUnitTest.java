package generic.pair;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PairUnitTest {

	Pair<Integer, String> pair ;
	Pair<Integer, String> pair2 ;
	
	@BeforeEach
	
	void setup() {
		
		pair = new Pair<>();
		
		pair2 = new Pair<>(134 , "junior");
	
	}
	

	
	@Test
	
	public void Test() {
		
		pair.setValue(123);
		
		pair.setWert("ken");
		
		assertEquals(123, pair.getValue());
		
		assertEquals( "Ken", pair.getWert());
		
		assertEquals(pair2.toString(), pair.toString());
	}
}
