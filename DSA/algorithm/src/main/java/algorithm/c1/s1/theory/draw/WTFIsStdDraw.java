package algorithm.c1.s1.theory.draw;

import edu.princeton.cs.algs4.StdDraw;

public class WTFIsStdDraw {
    public static void main(String[] args) {
        StdDraw.setCanvasSize(800,800);
        StdDraw.setXscale(-10, 110);
        StdDraw.setYscale(-10, 110);
        StdDraw.rectangle(10,10,10,10);
        StdDraw.point(10,10);
        StdDraw.line(10,10,20,10);
        //StdDraw.rectangle(10,10,20,10);
    }
}
