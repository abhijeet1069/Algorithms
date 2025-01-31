package algorithm.c1.s1.exercises;

import edu.princeton.cs.algs4.StdDraw;

public class RandomConnections {
    public static void main(String[] args) {
        int N = 30;
        double p = 0.8;

        double radius = 0.4;
        double centerX = 0.5, centerY = 0.5;

        double[][] points = new double[N][2];

        StdDraw.setCanvasSize(800,800);
        StdDraw.setScale(0,1);
        StdDraw.setPenRadius(0.005);

        // Compute positions of N points on the circle
        for (int i = 0; i < N; i++) {
            double angle = 2 * Math.PI * i / N;
            double x = centerX + radius * Math.cos(angle);
            double y = centerY + radius * Math.sin(angle);
            points[i][0] = x;
            points[i][1] = y;

            // Draw the point
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledCircle(x, y, 0.01);
        }

        // Draw random connections
        StdDraw.setPenRadius(0.002);
        StdDraw.setPenColor(StdDraw.GRAY);
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (Math.random() < p) { // Connect with probability p
                    StdDraw.line(points[i][0], points[i][1], points[j][0], points[j][1]);
                }
            }
        }
    }
}
