package algorithm.c1.s1.theory.math.beans;

public class Fraction {
	int numerator;
	int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	@Override
	public String toString() {
		return this.numerator+"/"+this.denominator;
	}	
	
}
