package algo.recursion.textbook;

/**
 * The recursion call happens before other computations in the function.
 * So you defer operations until the recursion unwinds.
 * */

public class HeadRecursion {

	static void headPrint(int n) {
		if(n == 0)
			return;
		headPrint(n-1);
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		headPrint(5);
	}
}
