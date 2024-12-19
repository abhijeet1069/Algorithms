package level1.string;

public class ValidAnagrams {

	public static boolean isAnagram(String s, String t) {
		if(s.length() != t.length())
			return false;
		
		int[] arr = new int[26];
		
		for(int i = 0; i < s.length(); i++)
			arr[s.charAt(i)-'a'] = arr[s.charAt(i)-'a']+1;
		
		for(int i = 0; i < t.length(); i++)
			arr[t.charAt(i)-'a'] = arr[t.charAt(i)-'a']-1;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String s = "rat";
		String t = "car";
		System.out.println(isAnagram(s,t));
	}
}
