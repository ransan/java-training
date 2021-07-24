package IPK.bit_magic;

public class FindNumberPowerOfTwo {
    public static void main(String[] args) {
        int number = 2;
        int ans = number & (number - 1);
        if (ans == 0) {
            System.out.println("number is Power of 2");
        } else {
            System.out.println("number is Not Power of 2");
        }
    }
}
