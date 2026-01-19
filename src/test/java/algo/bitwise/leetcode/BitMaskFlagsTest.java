package algo.bitwise.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BitMaskFlagsTest {

	@Test
	void testIsWritable() {
		int perms = BitMaskFlags.READ | BitMaskFlags.EXEC;
		assertFalse(BitMaskFlags.isWritable(perms));
		assertEquals(5,perms);
	}

}
