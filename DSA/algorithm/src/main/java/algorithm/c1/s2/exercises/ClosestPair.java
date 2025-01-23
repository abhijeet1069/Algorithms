package algorithm.c1.s2.exercises;

import edu.princeton.cs.algs4.*;

import java.awt.*;

public class ClosestPair {

	public static Point2D[] drawPoints(int N){
		Point2D[] points = new Point2D[N];
		for(int i = 0; i < N; i++){
			points[i] = new Point2D(StdRandom.uniformDouble(),StdRandom.uniformDouble());
			points[i].draw();
		}
		return points;
	}
	public static void main(String[] args) {
		Interval1D side = new Interval1D(1,1);
		Interval2D frame = new Interval2D(side,side);
		frame.draw();
		StdDraw.setPenRadius(0.005);
		int N = 200;
		Point2D[] points = drawPoints(N);
		double min = Double.MAX_VALUE;
		for(int i = 0;i < N-1; i++){
			for(int j = i+1; j < N; j++){
				double temp = points[i].distanceTo(points[j]);
				if(temp < min){
					min = temp;
					StdDraw.setPenColor(Color.RED);
					StdDraw.line(points[i].x(),points[i].y(), points[j].x(), points[j].y());
					StdOut.println("Min = "+min);
				}
			}
		}
	}
}
