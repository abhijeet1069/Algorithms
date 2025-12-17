package skeina.intro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SelectionSortTest {

	@Test
	void testSort() {
		int[] input = new int[]{1,4,5,3,2,7,6,8};
		int[] output = new int[] {1,2,3,4,5,6,7,8};
		assertArrayEquals(output,SelectionSort.sort(input));
	}

}
