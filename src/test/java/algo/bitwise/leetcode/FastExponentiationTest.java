package algo.bitwise.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FastExponentiationTest {

	@Test
	void testPower() {
		assertEquals(1024, FastExponentiation.power(2, 10));
		assertEquals(4096, FastExponentiation.power(4, 6));
		assertEquals(4096, FastExponentiation.power(4, 6));
		assertEquals(262144, FastExponentiation.power(8, 6));
	}

}
