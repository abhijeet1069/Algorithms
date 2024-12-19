package com.satyam.algorithm.fundamentals.programmingModel.exercises;

public class Transposition {
	
	private static void printMatrix(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}
	
	public static int[][] transpose(int[][] arr){
		int row = arr.length;
		int col = arr[0].length;
		int[][] newArr = new int[col][row];
		for(int i = 0; i < col; i++) {
			for(int j = 0; j < row; j++)
				newArr[i][j] = arr[j][i];
		}
		return newArr;
	}
}
