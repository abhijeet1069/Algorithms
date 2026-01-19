package algo.recursion.textbook;

/**
 * A function calls another function, which again calls the first one.
 * OP:
 *  A: 5
	B: 4
	A: 3
	B: 2
	 A: 1
 * */
public class IndirectRecursion {
	
	static void funA(int n) {
		if(n <= 0)
			return;
		System.out.println("A: "+n);
		funB(n-1);
	}
	
	static void funB(int n) {
		if(n <= 0)
			return;
		System.out.println("B: "+n);
		funA(n-1);
	}
	
	public static void main(String[] args) {
		funA(5);
	}
}
