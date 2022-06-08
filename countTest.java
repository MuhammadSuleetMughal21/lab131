package junit;

//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class countTest {

	@Test
	void test() {
		JUnitTesting obj=new JUnitTesting();
		int output=obj.countA("AAAaaasss");
		assertEquals(6, output);
		
	}

}
