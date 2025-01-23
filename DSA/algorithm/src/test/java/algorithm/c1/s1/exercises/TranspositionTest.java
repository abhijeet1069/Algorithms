package algorithm.c1.s1.exercises;

import org.junit.jupiter.api.Test;

public class TranspositionTest {

	@Test
	public void testTransposeBy3x5Matrix() {
		int[][] input = new int[][] {
			{1,2,3,5,6},
			{4,5,82,3,6},
			{6,8,2,3,4}
		};
		int[][] output = new int[][] {
			{1,4,6},
			{2,5,8},
			{3,82,2},
			{5,3,3},
			{6,6,4}
		};
		assertArrayEquals(output,Transposition.transpose(input));
	}
	
	@Test
	public void testTransposeBy1x3Matrix() {
		int[][] input = new int[][]{{1,2,3}};
		int[][] output = new int[][]{
				{1},
				{2},
				{3}};
		assertArrayEquals(output,Transposition.transpose(input));
	}
	
	@Test
	public void testTransposeByATransposedMatrix() {
		int[][] input = new int[][]{{1,2,3}};
		assertArrayEquals(input,Transposition.transpose(Transposition.transpose(input)));
	}
	
	@Test
	public void testTransposeBy2x3Matrix() {
		int[][] input = new int[][] {{2,4,6},
									 {4,9,8}};
		int[][] output = new int[][] {{2,4},
									  {4,9},
									  {6,8}};
		assertArrayEquals(output,Transposition.transpose(input));
	}
	
	@Test
	public void testTransposeBy2x2UnityMatrix() {
		int[][] input = new int[][] {{1,0},
									 {0,1}};
		assertArrayEquals(input,Transposition.transpose(input));
	}
	
}
