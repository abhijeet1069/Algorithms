package level1.maths;

public class SquareRoot {

    public static int mySqrt(int x) {
        int left = 0, right = x;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if((long)mid*mid < (long)x)
                left = mid + 1;
            else if((long)mid*mid > (long)x)
                right = mid - 1;
            else
                return mid;
        }
        return right;
    }

    public static void main(String[] args) {
        int num = 2147395599;
        System.out.println(mySqrt(num));
    }
}
