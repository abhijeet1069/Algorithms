package algo.recursion.textbook;


/**A function makes more than one recursive call.*/
public class TreeRecursion {

	static int fib(int n) {
	    if (n <= 1) return n;
	    return fib(n - 1) + fib(n - 2);
	}
	
	public static void main(String[] args) {
		System.out.println(fib(5));
	}
}
