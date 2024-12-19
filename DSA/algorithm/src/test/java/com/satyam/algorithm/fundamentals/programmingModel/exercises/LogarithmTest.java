package com.satyam.algorithm.fundamentals.programmingModel.exercises;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LogarithmTest {
	double err = 1e-15;
	
	@Test
	public void testLog2ForWholeNumbersWhichArePowerOf2() {
		assertEquals(3,Logarithm.log2(8));
	}
	
	@Test
	public void testLog2ForPowerOf2() {
		assertEquals(7,Logarithm.log2((int)Math.pow(2, 7)));
	}
	
	@Test
	public void testLog2ForNumberNotPowerOf2() {
		assertEquals(6,Logarithm.log2(100));
	}
}
