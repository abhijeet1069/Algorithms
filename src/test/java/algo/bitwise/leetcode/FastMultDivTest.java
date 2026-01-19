package algo.bitwise.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FastMultDivTest {

	@Test
	void testMultBy2() {
		assertEquals(10,FastMultDiv.multBy2(5));
		assertEquals(42,FastMultDiv.multBy2(21));
		assertEquals(102,FastMultDiv.multBy2(51));
	}

	@Test
	void testDivBy2() {
		assertEquals(23,FastMultDiv.divBy2(46));
		assertEquals(51,FastMultDiv.divBy2(102));
		assertEquals(11,FastMultDiv.divBy2(22));
	}

}
