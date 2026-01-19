package algo.recursion.textbook;

/** The recursive call’s argument itself is a recursive call. This is the famous McCarthy 91 function
 *  •	For any input n ≤ 100, the function always returns 91.
	•	For any input n > 100, it returns n − 10.

OP:
91
391	
	*/
public class NestedRecursion {
	
	static int nested(int n) {
		if(n > 100)
			return n-10;
		return nested(nested(n+11));
	}
	
	public static void main(String[] args) {
		System.out.println(nested(33));	
		System.out.println(nested(401));		
	}
}
