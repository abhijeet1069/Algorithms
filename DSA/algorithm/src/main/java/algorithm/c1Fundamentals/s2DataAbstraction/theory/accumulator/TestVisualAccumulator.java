package algorithm.c1Fundamentals.s2DataAbstraction.theory.accumulator;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

class VisualAccumulator{
	private double total;
	private int N;
	
	public VisualAccumulator(int trials, double max) {
		StdDraw.setXscale(0,trials);
		StdDraw.setYscale(0,max);
		StdDraw.setPenRadius(0.005);
	}
	
	public void addDataValue(double val) {
		N++;
		total += val;
		StdDraw.setPenColor(StdDraw.DARK_GRAY);
		StdDraw.point(N, val);
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.point(N, total/N);
	}
}

public class TestVisualAccumulator {
	public static void main(String[] args) {
		int T = 1000;
		VisualAccumulator a = new VisualAccumulator(T,1.0);
		for(int t = 0; t < T; t++)
			a.addDataValue(StdRandom.random());
		StdOut.print(a);
	}
}
