package algorithm.c1.s2.theory.counter;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Flips {

	public static void main(String[] args) {
		final int T = 1_000_000;
		Counter heads = new Counter("heads");
		Counter tails = new Counter("tails");
		for(int t = 0; t < T; t++) {
			if(StdRandom.bernoulli(0.5))
				heads.increment();
			else
				tails.increment();
		}
		StdOut.println(heads);
		StdOut.println(tails);
		
		StdOut.println("delta: "+Math.abs(heads.tally()-tails.tally()));
	}
}
