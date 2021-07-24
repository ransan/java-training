package IPK.recrusion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(getSum(123, 0));
    }

    private static int getSum(int n, int k) {
        if (n == 0) {
            return k;
        }
        return getSum(n/10, (k + (n%10)));
    }
}
