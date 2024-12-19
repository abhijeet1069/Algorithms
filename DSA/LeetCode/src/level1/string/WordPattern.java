package level1.string;

import java.util.HashMap;
import java.util.HashSet;

public class WordPattern {
	
	public static boolean wordPattern(String pattern, String s) {
        String[] strs = s.split(" ");
        if(pattern.length() != strs.length)
        	return false;
        HashMap<Character,String> map = new HashMap<>();
        
        HashSet<Character> charSet = new HashSet<>();
        HashSet<String> strSet = new HashSet<>();
        
        for(int i = 0; i < pattern.length(); i++) {
        	charSet.add(pattern.charAt(i));
        	strSet.add(strs[i]);
        	if(map.containsKey(pattern.charAt(i)) && !map.get(pattern.charAt(i)).equalsIgnoreCase(strs[i])) {
        		return false;
        	}
        	map.put(pattern.charAt(i),strs[i]);
        }
        return true && (charSet.size() == strSet.size());
    }

	public static void main(String[] args) {
		String pattern = "abba";
		String s = "dog dog dog dog";
		System.out.println(wordPattern(pattern,s));
	}
}
