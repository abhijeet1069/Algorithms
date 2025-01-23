package algorithm.c1.s1.exercises;

public class RussianMultiplication {

	public static int mystery(int a, int b){
		if (b == 0) 
			return 0;
		if (b % 2 == 0) 
			return mystery(a+a, b/2); //reject even halves
		return mystery(a+a, b/2) + a; //add all odd halves
	}

	public static void main(String[] args) {
		int a = 12;
		int b = 12;
		System.out.println(mystery(a,b));
	}
}
