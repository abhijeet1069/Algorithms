package skeina.intro;

public class Horner {

	public static int polyVal(int[] coeff, int x) {
		int p = coeff[0];
		for(int i = 1; i < coeff.length; i++)
			p = p*x + coeff[i];
		return p;
	}
}
