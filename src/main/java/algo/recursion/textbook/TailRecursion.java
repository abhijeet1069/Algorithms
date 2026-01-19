package algo.recursion.textbook;

/**
 * In tail recursion, the recursive call is the last operation in the function.
5
4
3
2
1
 * 
 * */
public class TailRecursion {

	static void tailPrint(int n) {
		if(n == 0)
			return;
		System.out.println(n);
		tailPrint(n-1);
	}
	
	public static void main(String[] args) {
		tailPrint(5);
	}

}
