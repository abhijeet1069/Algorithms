package algorithm.c1Fundamentals.s2DataAbstraction.exercises;

import java.util.Arrays;

public class ClosestPair {

	public static class Point{
		double x,y;	
		public Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static double distance(Point p1, Point p2) {
		return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
	}
	
	public static double bruteForce(Point[] points, int n) {
		double minDist = Double.MAX_VALUE;
		for(int i = 0; i < n; ++i) {
			for(int j = i+1; j < n; ++j) {
				double dist = distance(points[i],points[j]);
				if(dist < minDist)
					minDist = dist;
			}
		}
		return minDist;
	}
	
	public static double closestSplitPair(Point[] points, int start, int end, double delta) {
		int mid = (start+end)/2;
		Point midPoint = points[mid];
		Point[] strip = new Point[end-start+1];
		int j = 0;
		for(int i = start; i <= end; i++) {
			if(Math.abs(points[i].x-midPoint.x) < delta) {
				strip[j] = points[i];
				j++;
			}
		}
		Arrays.sort(strip,0,j,(p1,p2)->Double.compare(p1.y, p2.y));
		double minDist = delta;
		for(int i = 0; i < j; ++i) {
			for(int k = i+1; k < j && (strip[k].y - strip[i].y) < minDist; ++k) {
				double dist = distance(strip[i],strip[k]);
				if(dist<minDist)
					minDist = dist;
			}
		}
		return minDist;
	}
	
	public static double closestPair(Point[] points, int start, int end) {
		if(end-start <= 3) {
			return bruteForce(points, end-start+1);
		}
		int mid = (start+end)/2;
		double leftDist = closestPair(points,start,mid);
		double rightDist = closestPair(points,mid+1,end);
		double delta = Math.min(leftDist, rightDist);
		double splitDist = closestSplitPair(points,start,end,delta);
		return Math.min(delta, splitDist);
	}
	
	public static void main(String[] args) {
		Point[] points = { 
				new Point(2, 3), 
				new Point(12, 30), 
				new Point(40, 50), 
				new Point(5, 1), 
				new Point(12, 10), 
				new Point(3, 4) }; 
		Arrays.sort(points, (p1, p2) -> Double.compare(p1.x, p2.x)); 
		double closestDist = closestPair(points, 0, points.length - 1); 
		System.out.println("The smallest distance is " + closestDist);
	}

}
