package algo.bitwise.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class IntToBinaryTest {

	@Test
	void testToBinary() {
		assertEquals("100",IntToBinary.toBinary(4));
		assertEquals("1111",IntToBinary.toBinary(15));
	}
	
	@Test
	void testToBinary32() {
		assertEquals("00000000 00000000 00000000 00000100",IntToBinary.toBinary32(4));
		assertEquals("11111111 11111111 11111111 11111111",IntToBinary.toBinary32(-1));
	}

}
