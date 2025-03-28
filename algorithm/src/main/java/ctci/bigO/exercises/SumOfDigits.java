package ctci.bigO.exercises;

public class SumOfDigits {

    public static int sumDigits(int n){
        int sum = 0;
        while(n > 0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 1234533;
        System.out.println(sumDigits(num));
    }
}
