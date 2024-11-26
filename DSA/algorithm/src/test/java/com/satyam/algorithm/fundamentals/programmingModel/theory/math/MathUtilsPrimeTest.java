package com.satyam.algorithm.fundamentals.programmingModel.theory.math;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MathUtilsPrimeTest {

static final double DELTA = 0.0001;
	
	@Test
	public void testPrimeWithInt() {
		assertFalse(MathUtils.isPrime(10));
		assertTrue(MathUtils.isPrime(7));
	}
}
