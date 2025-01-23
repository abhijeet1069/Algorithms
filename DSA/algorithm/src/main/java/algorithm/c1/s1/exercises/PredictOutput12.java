package algorithm.c1.s1.exercises;

public class PredictOutput12 {
/**
 * Output : 0 1 2 3 4 4 3 2 1 0 <br/>
 * Its interesting because normally we would think output to be 0 1 2 3 4 5 6 7 8 9
 * */
	public static void main(String[] args) {
		
		int[] a = new int[10];
		for(int i = 0; i < 10; i++)
			a[i] = 9 - i;
		for(int i = 0; i < 10; i++)
			a[i] = a[a[i]];
		for(int i = 0; i < 10; i++)
			System.out.print(a[i]+" ");

	}
}
