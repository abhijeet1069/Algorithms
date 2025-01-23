package algorithm.c1.s1.exercises;

import algorithm.c1.s1.theory.math.EuclidGCD;

public class Print2DBooleanArray {

	private static void printArr(boolean[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j])
					System.out.print("*");
				else
					System.out.print("_");
			}
			System.out.println();
		}
	}
	private static boolean isCoPrime(int a, int b) {
		int gcd = EuclidGCD.gcd(a, b);
		if(gcd == 1)
			return false;
		else
			return true;
	}
	
	public static void main(String[] args) {
		boolean arr[][] = new boolean[10][10];
		
		//for(int i = 0)
	}
}
