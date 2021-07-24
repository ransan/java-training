package IPK.math;

public class PrimeFactorsOfNumber {
    public static void main(String[] args) {
        int number = 450;
        if (number == 1) System.out.println("Number is not prime");
        for (int i = 2; i * i <= number; i++) {
            while (number % i == 0) {
                System.out.println(i);
                number = number / i;
            }
        }
        if (number > 1) System.out.println(number);
    }
}
