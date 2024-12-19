package level1.string;

import java.util.Stack;

public class ReverseVowels {

	private static boolean isVowel(char ch) {
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			return true;
		if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			return true;
		return false;
	}
	
	public static String reverseVowels(String s) {
		String res = "";
		char[] arr = new char[s.length()];
		Stack<Character> vowelStack = new Stack<>();
		
		for(int i = 0 ;i < s.length(); i++) {
			if(!isVowel(s.charAt(i)))
				arr[i] = s.charAt(i);
			else
				vowelStack.push(s.charAt(i));
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0)
				arr[i] = vowelStack.pop();
		}
		
		for(char ch : arr)
			res += ch;
		
		return res;
	}
	
	public static void main(String[] args) {
		String str = "leetcode";
		System.out.println(reverseVowels(str));
	}
}
