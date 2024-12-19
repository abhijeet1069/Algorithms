package com.satyam.algorithm.fundamentals.programmingModel.theory.array;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class MaxOfArrayTest {
	
	private static MaxOfArray obj;
	static final String EMPTY = "";
	
	@BeforeClass
	public static void setup() {
		obj = new MaxOfArray();
	}
	
	@Test
	public void testMaxWithSmallArray() {
		int[] arr = new int[] {2,10,100,-1,4,20,5,250};
		int max = 0;
		String errMsg = EMPTY;
		try {
			max = obj.max(arr);
		}
		catch(Exception e) {
			errMsg = e.getMessage();
		}
		assertEquals(250,max);
		assertEquals(EMPTY,errMsg);
	}
	
	@Test
	public void testMaxWithZeroArray() {
		int[] arr = new int[0];
		int max = 0;
		String errMsg = EMPTY;
		try {
			max = obj.max(arr);
		}
		catch(Exception e) {
			errMsg = e.getMessage();
		}
		assertEquals(0,max);
		assertEquals("Input array cannot have size zero",errMsg);
	}
	
	@Test
	public void testMaxWithNullArray() {
		int[] arr = null;
		int max = 0;
		String errMsg = EMPTY;
		try {
			max = obj.max(arr);
		}
		catch(Exception e) {
			errMsg = e.getMessage();
		}
		assertEquals(0,max);
		assertEquals("Input array cannot be null",errMsg);
	}
	
	@Test
	public void testMaxWithNegativeArray() {
		int[] arr = new int[] {-2,-10,-100,-1,-4,-20,-5,-250};
		int max = 0;
		String errMsg = EMPTY;
		try {
			max = obj.max(arr);
		}
		catch(Exception e) {
			errMsg = e.getMessage();
		}
		assertEquals(-1,max);
		assertEquals(EMPTY,errMsg);
	}
}
