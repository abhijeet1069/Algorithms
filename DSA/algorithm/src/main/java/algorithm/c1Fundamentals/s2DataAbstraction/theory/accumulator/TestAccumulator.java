package algorithm.c1Fundamentals.s2DataAbstraction.theory.accumulator;

import edu.princeton.cs.algs4.Accumulator;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class TestAccumulator {

	public static void main(String[] args) {
		int T = 10000;
		Accumulator a = new Accumulator();
		for(int t = 0; t < T; t++)
			a.addDataValue(StdRandom.random());
		StdOut.println(a);
	}
}
