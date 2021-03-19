import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test_methode {

	
	@Test
	void test1() {
		Hello_world junit = new 	Hello_world();
	  
		String erg = junit.hello("azzeddin");
		assertEquals("helloazzeddin",erg);
	
	}

}
