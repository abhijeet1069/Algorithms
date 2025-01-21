package algorithm.c1Fundamentals.s1programmingModel.theory.array;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class AverageOfArrayTest {
	
	private static AverageOfArray obj;
	static final String EMPTY = "";
	static final double DELTA = 0.0001;
	
	@BeforeClass
	public static void setup() {
		obj = new AverageOfArray();
	}
	
	@Test
	public void testAverageWithSmallArray() {
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		double avg = 0.0;
		String errMsg = EMPTY;
		try {
			avg = obj.average(arr);
		}
		catch(Exception e) {
			errMsg = e.getMessage();
		}
		assertEquals(5.5,avg,DELTA);
		assertEquals(EMPTY,errMsg);
	}
	
	@Test
	public void testAverageWithZeroArray() {
		int[] arr = new int[0];
		double avg = 0.0;
		String errMsg = EMPTY;
		try {
			avg = obj.average(arr);
		}
		catch(Exception e) {
			errMsg = e.getMessage();
		}
		assertEquals(0,avg,DELTA);
		assertEquals("Input array cannot have zero length",errMsg);
	}
	
	@Test
	public void testAverageWithNullArray() {
		int[] arr = null;
		double avg = 0;
		String errMsg = EMPTY;
		try {
			avg = obj.average(arr);
		}
		catch(Exception e) {
			errMsg = e.getMessage();
		}
		assertEquals(0,avg,DELTA);
		assertEquals("Input array cannot be null",errMsg);
	}
	
	@Test
	public void testMaxWithDuplicates() {
		int[] arr = new int[] {5,5,5};
		double avg = 0;
		String errMsg = EMPTY;
		try {
			avg = obj.average(arr);
		}
		catch(Exception e) {
			errMsg = e.getMessage();
		}
		assertEquals(5.0,avg,DELTA);
		assertEquals(EMPTY,errMsg);
	}
	
	@Test
	public void testAverageWithMixedPositiveAndNegatives() {
		int[] arr = new int[] {1, -1, 3, -3, 5};
		double avg = 0;
		String errMsg = EMPTY;
		try {
			avg = obj.average(arr);
		}
		catch(Exception e) {
			errMsg = e.getMessage();
		}
		assertEquals(1.0,avg,DELTA);
		assertEquals(EMPTY,errMsg);
	}
}
