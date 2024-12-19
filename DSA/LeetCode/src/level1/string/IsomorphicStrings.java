package level1.string;

import java.util.HashMap;

public class IsomorphicStrings {

	public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
        	return false;
        HashMap<Character,Character> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
        	//if there is a different mapping for a character, then its not isomorphic.
        	if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) != t.charAt(i)) {
        		return false;
        	}
        	map.put(s.charAt(i), t.charAt(i));
        }
        return true;
    }
	
	public static void main(String[] args) {
		String str1 = "badc";
		String str2 = "baba";
		System.out.println(isIsomorphic(str1,str2) && isIsomorphic(str2,str1));
	}
}
