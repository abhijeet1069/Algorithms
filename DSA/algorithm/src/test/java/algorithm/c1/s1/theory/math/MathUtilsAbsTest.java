package algorithm.c1.s1.theory.math;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathUtilsAbsTest {

	static final double DELTA = 0.0001;
	
	@Test
	public void testAbsWithInt() {
		assertEquals(10,MathUtils.abs(10));
	}
	
	@Test
	public void testAbsWithNegativeInt() {
		assertEquals(10,MathUtils.abs(-10));
	}
	
	@Test
	public void testAbsWithDouble() {
		assertEquals(10.5,MathUtils.abs(-10.5),DELTA);
	}
	
	@Test
	public void testAbsWithNegativeDouble() {
		assertEquals(10.5,MathUtils.abs(-10.5),DELTA);
	}
}
