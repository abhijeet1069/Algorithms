package level1.string;

public class ExcelSheetColumn {
	
	public static String convertToTitle(int columnNumber) {
        int rem = 0;
        String res = "";
        while(columnNumber > 0) {
        	rem = columnNumber%26;
        	if(rem == 0) {
        		res = "Z" + res;
        		columnNumber = columnNumber/26-1;
        	}
        	else {
        		res = Character.toString((char)(64+rem)) + res;
        		columnNumber = columnNumber/26;
        	}
        }
        return res;
    }

	public static void main(String[] args) {
		int columnNumber = 701;
		System.out.println(convertToTitle(columnNumber));
	}

}
