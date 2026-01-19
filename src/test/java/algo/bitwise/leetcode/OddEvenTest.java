package algo.bitwise.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OddEvenTest {

	@Test
	void testIsEven() {
		assertTrue(OddEven.isEven(22));
		assertTrue(OddEven.isEven(220));
		assertTrue(OddEven.isEven(428));
		assertFalse(OddEven.isEven(23));
	}

}
