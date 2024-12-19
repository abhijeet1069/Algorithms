package level1.string;

public class ValidPalindrome {

	private static boolean checkPalindrome(String s) {
		boolean isPalindrome = true;
		int len = s.length();
		for(int i = 0; i < len/2; i++) {
			if(s.charAt(i) != s.charAt(len-i-1)) {
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;
	}
	
	private static boolean isPalindrome(String s) {
		s = s.trim().toLowerCase();
		String str = "";
		for(int i = 0; i < s.length(); i++) {
			if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) 
				str += s.charAt(i);
		}
		return checkPalindrome(str);
	}
	
	public static void main(String[] args) {
		String s = "0P";
		System.out.println(isPalindrome(s));
	}
}
