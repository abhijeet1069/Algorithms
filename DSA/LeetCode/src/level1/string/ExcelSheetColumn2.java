package level1.string;

public class ExcelSheetColumn2 {

	public static int titleToNumber(String columnTitle) {
        int res = 0;
        for(int i = 0; i < columnTitle.length(); i++) {
        	int placeValue = columnTitle.length()-1-i;
        	res += (columnTitle.charAt(i)-64)*Math.pow(26, placeValue);
        }
        return res;
    }
	
	public static void main(String[] args) {
		String columnTitle = "ZY";
		System.out.println(titleToNumber(columnTitle));
	}
}
