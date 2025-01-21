package algorithm.c1Fundamentals.s1programmingModel.exercises;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class LogarithmTest {
	double err = 1e-15;
	
	@Test
	public void testLog2ForWholeNumbersWhichArePowerOf2() {
		Assertions.assertEquals(3,Logarithm.log2(8));
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
