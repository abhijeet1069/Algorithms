package algo.recursion.textbook;
/** Direct Recursion - A function calls itself directly. 
 * OP
 *  5
	4
	3
	2
	1
 * */
public class DirectRecursion {
	static void print(int n) {
		if(n == 0)
			return;
		System.out.println(n);
		print(n-1);
	}
	
	public static void main(String[] args) {
		print(5);
	}
}
