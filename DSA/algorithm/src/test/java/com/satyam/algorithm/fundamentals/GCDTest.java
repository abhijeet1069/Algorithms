package com.satyam.algorithm.fundamentals;

import org.junit.Test; 
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;

public class GCDTest {
	
	private static GCD gcd;
	
	@BeforeClass
	public static void setup() {
		gcd = new GCD();
	}

	@Test
	public void testGcdwithCoPrime() {
		assertEquals(1,gcd.gcd(3,10));
		assertEquals(1, gcd.gcd(7, 5));
	}
	
	@Test
	public void testGcdwithZeroAndNonZero() {
		assertEquals(3,gcd.gcd(0,3));
		assertEquals(5,gcd.gcd(0,5));
	}
	
	@Test
	public void testGcdwithNonZeroAndZero() {
		assertEquals(3,gcd.gcd(3,0));
		assertEquals(5,gcd.gcd(5,0));
	}
	
	@Test
	public void testGcdwithNonZeroAndNonZero() {
		assertEquals(2,gcd.gcd(6,8));
	}
	
	@Test 
	public void testGcdWithSameNumbers() { 
		assertEquals(7, gcd.gcd(7, 7));  
		assertEquals(100, gcd.gcd(100, 100)); 
	}
	
	}
