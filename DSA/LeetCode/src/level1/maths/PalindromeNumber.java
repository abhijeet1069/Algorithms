package level1.maths;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        String str = ""+x;
        boolean isPalindrome = true;
        int len = str.length();
        for(int i = 0; i < len/2; i++) {
            if(str.charAt(i) != str.charAt(len-i-1)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
}
