package IPK.math;

public class DivisorsOfNumber {
    public static void main(String[] args) {
        int number = 25;
        for (int i=1;i*i<=number;i++) {
            if (number%i == 0) {
                System.out.println(i);
                if (i != (number/i)) System.out.println(number/i);
            }

        }
    }
}
