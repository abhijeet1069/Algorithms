package level1.string;

public class FirstIndexOfString {

	
	public static int strStr(String haystack, String needle) {
		return haystack.indexOf(needle);
    }
	public static void main(String[] args) {
		String haystack = "sadbutsad";
		String needle = "1sad";
		System.out.println(strStr(haystack,needle));
	}
}
