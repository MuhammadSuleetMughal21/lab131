package junit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class isPrimeTest {

	@Test
	void test123() {

		assertEquals(true,  JUnitTesting.isPrime(2));
	}

}
