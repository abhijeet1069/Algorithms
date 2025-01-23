package algorithm.c1.s1.theory.plotting;

import edu.princeton.cs.algs4.StdDraw;

public class DrawCoordinates {
	
	//Border Padding is necessary else endpoints like 1.0 or -1.0 go out of bounds
	private static double BORDER_PADDING = 0.001;
	private static int CANVAS_WIDTH = 400;
	private static int CANVAS_HEIGHT = 400;
	
	public static void main(String[] args) {	
		StdDraw.setXscale(-1-BORDER_PADDING, 1+BORDER_PADDING); 
	    StdDraw.setYscale(-1-BORDER_PADDING, 1+BORDER_PADDING);
		StdDraw.line(-1,0,1,0);
		StdDraw.line(0,1,0,-1);
		
		int intervals = 10;
		double lineSpacing = 1.0/intervals;
		StdDraw.setPenRadius(0.006);
		for(int i = 0; i < intervals; i++) {
			double grid_point = i*lineSpacing;
			StdDraw.point(grid_point,0);
			StdDraw.point(-grid_point,0);
			StdDraw.point(0,grid_point);
			StdDraw.point(0,-grid_point);
		}
			
			
	}
}
