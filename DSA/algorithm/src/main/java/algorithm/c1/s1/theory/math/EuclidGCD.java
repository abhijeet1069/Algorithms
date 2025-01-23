package algorithm.c1.s1.theory.math;

import algorithm.c1.s1.theory.math.beans.Fraction;

public class EuclidGCD {
	
	public static int gcd(int a, int b) {     	
		if(a <= 0 || b <= 0)
			throw new IllegalArgumentException("Only positive integers allowed");
		
		while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
	
	public static Fraction simplify(Fraction f1) {
		int gcd = gcd(f1.getNumerator(),f1.getDenominator());
		Fraction res = new Fraction(f1.getNumerator()/gcd, f1.getDenominator()/gcd);
		return res;
	}
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction(48,18);
		System.out.println(f1);
		System.out.println(simplify(f1));
	}
}
