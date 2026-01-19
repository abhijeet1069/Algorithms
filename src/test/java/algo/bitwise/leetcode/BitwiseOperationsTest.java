package algo.bitwise.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BitwiseOperationsTest {

	@Test
	void testGetBit() {
		//5 = 101
		assertEquals(1,BitwiseOperations.getBit(5, 2));
	}

	@Test
	void testSetBit() {
		assertEquals(7,BitwiseOperations.setBit(5, 1));
	}

	@Test
	void testClearBit() {
		assertEquals(1,BitwiseOperations.clearBit(5, 2));
	}

	@Test
	void testToggleBit() {
		assertEquals(1,BitwiseOperations.toggleBit(5, 2));
		assertEquals(5,BitwiseOperations.toggleBit(1, 2));
	}

}
