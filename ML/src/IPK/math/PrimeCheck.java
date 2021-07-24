package IPK.math;


public class PrimeCheck {
    public static void main(String[] args) {
        int number = 1031;
        // Time Complexity Root of n
        System.out.println(isPrime(number));
        System.out.println(isPrimeOptimumSolution(number));
    }

    private static boolean isPrimeOptimumSolution(int number) {
        if (number == 1) return false;
        if (number == 2 || number == 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return true;
        for (int i = 5; i * i <= number; i = i + 6) {
            if ((number % i == 0) || (number % (i + 2) == 0)) return true;
        }
        return false;
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return true;
            }
        }
        return false;
    }
}
