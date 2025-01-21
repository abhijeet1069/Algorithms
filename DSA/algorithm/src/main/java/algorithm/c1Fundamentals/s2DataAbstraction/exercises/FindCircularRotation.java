package algorithm.c1Fundamentals.s2DataAbstraction.exercises;

public class FindCircularRotation {
	
	public static boolean isCircularRotation(String original, String rotated) {
		if(original.length() != rotated.length())
			return false;
		String text = original+original;
		if(text.contains(rotated))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		String original = "ACTGACG";
		String rotated = "TGACGAC";
		System.out.println(isCircularRotation(original, rotated));
		System.out.println(isCircularRotation(rotated, original));
		
	}
}
