package level1.string;

public class AddBinary {

	public static String addBinary(String a, String b) {
		//smaller length in a
		if(a.length() > b.length()) {
			String temp = a;
			a = b;
			b = temp;
		}
		//prepend extra 0 to smaller string
		for(int i = a.length(); i < b.length(); i++)
			a = "0"+a;
		
		int carry = 0;
		String res = "";
		for(int i = a.length()-1; i >= 0; i--) {
			int in1 = a.charAt(i)-'0';
			int in2 = b.charAt(i)-'0';
			
			//full adder formula
			res = (in1^in2^carry) + res;
			carry = (in1 & in2) | (carry & (in1 ^ in2));
		}
		if(carry == 1) {
			return "1"+res;
		}
		else {
			return res;
		}
	}
	
	public static void main(String[] args) {
		String a = "1010";
		String b = "1011";
		System.out.println(addBinary(a,b));
	}
}
