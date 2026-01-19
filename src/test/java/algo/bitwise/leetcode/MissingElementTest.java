package algo.bitwise.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * An unsorted array of size n contains distinct integers between 1 and n + 1,
with one element missing. Give an O(n) algorithm to find the missing integer,
without using any extra space.

XOR is a good logic and its commutative.
 * */
class MissingElementTest {

	@Test
	void testGetMissingElement1() {
		int[] arr = {2,1,4,6,3};
		assertEquals(5, MissingElement.getMissingElement(arr));
	}
	
	@Test
	void testGetMissingElement2() {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		assertEquals(10, MissingElement.getMissingElement(arr));
	}

}
