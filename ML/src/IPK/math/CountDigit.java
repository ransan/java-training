package IPK.math;

// Time Complexity O(d) - d is Degit
public class CountDigit {
    public static void main(String[] args) {
        int number = 1234;
        Math.abs(-32);
        System.out.println("Digit size : " + Math.abs(-32));
    }

    private static int getDigit(int number) {
        if (number == 0)
            return 0;
        return 1 + getDigit(number/10);
    }
}
