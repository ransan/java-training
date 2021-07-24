package IPK.math;

// Space complexity O(n)
// Time Complexity O(n)
public class FactorialOfNumber {
    public static void main(String[] args) {
        int number = 10;
        iterativeFactorial(number);
        System.out.println(iterativeFactorial(number));
        System.out.println(getFactorial(number));
    }

    private static int iterativeFactorial(int number) {
        int res = 1;
        for (int i=1;i<=number;i++) {
            res = res * i;
        }
        return res;
    }

    private static int getFactorial(int number) {
        if (number == 0)
            return 1;
        return number * getFactorial(number -1);
    }
}
