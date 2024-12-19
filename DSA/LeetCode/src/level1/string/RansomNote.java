package level1.string;

public class RansomNote {

	public static boolean canConstruct(String ransomNote, String magazine) {
        int[] magArr = new int[26];
        for(int i = 0; i < magazine.length(); i++)
        	 magArr[magazine.charAt(i)-'a']++;
        
        for(int i = 0; i < ransomNote.length(); i++) {
        	char c = ransomNote.charAt(i);
        	if(magArr[c-'a'] > 0)
        		magArr[c-'a']--;
        	else
        		return false;
        }
        return true;
    }
	
	public static void main(String[] args) {
		String ransomNote = "aa", magazine = "aab";
		System.out.println(canConstruct(ransomNote,magazine));
	}
}
