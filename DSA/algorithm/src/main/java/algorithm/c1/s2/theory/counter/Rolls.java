package algorithm.c1.s2.theory.counter;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Rolls {

	public static void main(String[] args) {
		final int T = 1000_000;
		final int SIDES = 6;
		Counter[] rolls = new Counter[SIDES+1];
		
		for(int i = 1; i <= SIDES; i++)
			rolls[i] = new Counter(i+ "'s");
		
		for(int t = 0; t < T; t++) {
			int result = StdRandom.uniform(1,SIDES+1);
			rolls[result].increment();
		}
		
		for(int i = 1; i <= SIDES; i++)
			StdOut.println(rolls[i]);
	}
}
