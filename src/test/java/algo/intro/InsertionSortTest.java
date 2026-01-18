package algo.intro;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InsertionSortTest {

	@Test
	void testInsertionSort1() {
		int[] arr = new int[] {23,12,32,42,44,232,34,23,343,23,23,443,233,442,43,12,3};
		int[] sortedArr = javaStdSort(arr);
		InsertionSort is = new InsertionSort();
		assertArrayEquals(sortedArr, is.sort(arr));
	}
	
	@Test
	void testInsertionSort2() {
		int[] arr = new int[] {21,24,1,24,11,98,12,100,1,-12,0,3,34,23,1,100,3};
		int[] sortedArr = javaStdSort(arr);
		InsertionSort is = new InsertionSort();
		assertArrayEquals(sortedArr, is.sort(arr));
	}
	
	private int[] javaStdSort(int[] arr) {
		int[] res = arr.clone();
		Arrays.sort(res);
		return res;
	}

}
