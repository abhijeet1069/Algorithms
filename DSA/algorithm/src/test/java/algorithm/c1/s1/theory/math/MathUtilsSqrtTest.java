package algorithm.c1.s1.theory.math;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathUtilsSqrtTest {

	static final double DELTA = 0.001;
	
	@Test
	public void testSqrtWithPerfectSquare() {
		assertEquals(20,MathUtils.sqrt(400),DELTA);
	}
	
	@Test
	public void testSqrtWithImperfectSquare() {
		assertEquals(15.033,MathUtils.sqrt(226),DELTA);
	}
}
