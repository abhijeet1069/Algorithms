package algorithm.c1Fundamentals.s1programmingModel.theory.math;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EuclidGCDTest {

	@Test(expected = IllegalArgumentException.class)
	public void testGcdwithBothZero() {
		EuclidGCD.gcd(0,0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGcdwithFirstZero() {
		assertEquals(12,EuclidGCD.gcd(0,12));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGcdwithSecondZero() {
		assertEquals(12,EuclidGCD.gcd(12,0));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGcdwithFirstNegative() {
		assertEquals(4,EuclidGCD.gcd(-16,4));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGcdwithSecondNegative() {
		assertEquals(4,EuclidGCD.gcd(16,-4));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGcdwithBothNegative() {
		assertEquals(4,EuclidGCD.gcd(-16,-4));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGcdwithZeroAndNonZero() {
		assertEquals(3,EuclidGCD.gcd(0,3));
		assertEquals(5,EuclidGCD.gcd(0,5));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGcdwithNonZeroAndZero() {
		assertEquals(3,EuclidGCD.gcd(3,0));
		assertEquals(5,EuclidGCD.gcd(5,0));
	}

	@Test
	public void testGcdwithCoPrime() {
		assertEquals(1,EuclidGCD.gcd(3,10));
		assertEquals(1, EuclidGCD.gcd(7, 5));
	}

	@Test
	public void testGcdwithNonZeroAndNonZero() {
		assertEquals(2,EuclidGCD.gcd(6,8));
	}

	@Test 
	public void testGcdWithSameNumbers() { 
		assertEquals(7, EuclidGCD.gcd(7, 7));  
		assertEquals(100, EuclidGCD.gcd(100, 100)); 
	}

}
