package algorithm.c1.s1.exercises;
import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;

public class Histogram {
	public static void main(String[] args) {
		int[] arr = new int[]{2,7,8,12,14,16,18,19,23,26,28,30};
		Interval[] intervals = new Interval[]{
				new Interval(0,5,1),
				new Interval(5,10,2),
				new Interval(10,15,2),
				new Interval(15,20,3),
				new Interval(20,25,1),
				new Interval(25,30,3)
		};
		drawAxes(intervals);
		drawHistogram(intervals);
	}

	public static void drawHistogram(Interval[] intervals){
		for(int i = 0; i < intervals.length;i++){
			double centreX = intervals[i].getLeft()+Interval.getXStepSize()/2.0;
			double centreY = (intervals[i].getFreq())/2.0;
			double width = (intervals[0].getRight()-intervals[0].getLeft())/2.0;
			StdDraw.rectangle(centreX,centreY,width,intervals[i].getFreq()/2.0);
			StdDraw.point(centreX,centreY);
		}
	}

	public static void drawAxes(Interval[] intervals){
		 final int xPadding = 10;
		 final int yPadding = 1;
		 final double xTickSize = 0.01;
		 final double yTickSize = 0.1;

		// Set coordinate system: Keep (0,0) at bottom-left
		StdDraw.setXscale(-xPadding, Interval.getMaxRight()+xPadding);  // Extra space for labels
		StdDraw.setYscale(-yPadding, Interval.getMaxFreq()+yPadding);
		StdDraw.setCanvasSize(800, 800); // Adjust canvas size

		// Draw X and Y axes
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.line(0, 0, Interval.getMaxRight(), 0); // X-axis
		StdDraw.line(0, 0, 0, Interval.getMaxFreq()); // Y-axis
		// Draw tick marks and numbering for X and Y axes
		for (int i = 0; i < intervals.length; i++) {
			// X-axis numbers
			StdDraw.line(intervals[i].getRight(), -xTickSize, intervals[i].getRight(), xTickSize);  // Small vertical tick
			StdDraw.text(intervals[i].getRight(), -0.1, String.valueOf(intervals[i].getRight())); // Number below tick
		}

		for(int i = 0; i <= Interval.getMaxFreq(); i+=Interval.getYStepSize()){
			// Y-axis numbers
			StdDraw.line(-yTickSize, i, yTickSize, i);  // Small horizontal tick
			StdDraw.text(-0.5, i, String.valueOf(i)); // Number left of tick
		}
		StdDraw.show();
	}
}

/**
 * This intervals are left inclusive.
 * */
class Interval{
	private final int left,right,freq;
	private static int maxRight = Integer.MIN_VALUE;
	private static int maxFreq = Integer.MIN_VALUE;
	private final static int xStepSize = 5;
	private final static int yStepSize = 1;

	public Interval(int left, int right,int freq) {
		this.left = left;
		this.right = right;
		this.freq = freq;

		if(right > maxRight)
			maxRight = right;

		if(freq > maxFreq)
			maxFreq = freq;
	}

	public int getLeft() {
		return left;
	}

	public int getRight() {
		return right;
	}

	public int getFreq() {
		return freq;
	}

	public static int getMaxRight() {
		return maxRight;
	}

	public static int getXStepSize() {
		return xStepSize;
	}

	public static int getMaxFreq() {
		return maxFreq;
	}

	public static int getYStepSize() {
		return yStepSize;
	}
}
