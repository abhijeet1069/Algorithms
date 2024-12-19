package level1.string;

public class LengthOfLastWord {

	public static int lengthOfLastWord(String str) {
        String[] arr = str.split(" ");
        return arr[arr.length-1].length();
    }
	
	public static void main(String[] args) {
		String str = "luffy is still joyboy";
		System.out.println(lengthOfLastWord(str));
	}
}
