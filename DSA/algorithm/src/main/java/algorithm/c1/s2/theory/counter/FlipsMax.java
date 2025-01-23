package algorithm.c1.s2.theory.counter;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class FlipsMax {
	
	public static Counter max(Counter x, Counter y) {
		if(x.tally() > y.tally())
			return x;
		else
			return y;
	}
	
	public static void main(String[] args) {
		int T = 1_000_000_00;
		Counter heads = new Counter("heads");
		Counter tails = new Counter("tails");
		for(int t = 0; t < T; t++) {
			if(StdRandom.bernoulli(0.5))
				heads.increment();
			else
				tails.increment();
		}
		if(heads.tally() == tails.tally())
			StdOut.println("Tie");
		else
			StdOut.println(max(heads,tails)+" wins");
	}
}
