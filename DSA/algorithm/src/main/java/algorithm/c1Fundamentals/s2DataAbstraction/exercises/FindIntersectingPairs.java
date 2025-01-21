package algorithm.c1Fundamentals.s2DataAbstraction.exercises;

import java.util.ArrayList;
import java.util.List;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdOut;

public class FindIntersectingPairs {

	private static Interval1D findIntersectingInterval(List<Interval1D> intervals) {
		intervals.sort((Interval1D interval1, Interval1D interval2)->Double.compare(interval1.min(),interval2.min()));
		int size = intervals.size();
		Interval1D result = null;
		for(int i = 0; i < size-1; i++) {
			for(int j = 1; j < size; j++) {
				Interval1D interval1 = intervals.get(i);
				Interval1D interval2 = intervals.get(j);
				if(interval1.min() < interval2.max() && interval1.max() > interval2.min())
					result= new Interval1D(Math.max(interval1.min(),interval2.min()),
										   Math.min(interval1.max(), interval2.max()));
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		List<Interval1D> intervals = new ArrayList<>();
		intervals.add(new Interval1D(2,3));
		intervals.add(new Interval1D(2,5));
		intervals.add(new Interval1D(2,8));
		intervals.add(new Interval1D(9,10));
		intervals.add(new Interval1D(3,4));
		
		Interval1D result = findIntersectingInterval(intervals);
		StdOut.println(result);
	}
}
