package IPK.bit_magic;

public class FindKthBitIsSetOrNot {
    public static void main(String[] args) {
        int number = 13;
        int k = 3;
        leftShiftApproach(number, k);
        rightShiftApproach(number, k);
    }

    private static void rightShiftApproach(int number, int k) {
        if (((number >> (k - 1)) & 1) == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static void leftShiftApproach(int number, int k) {
        if ((number & (1 << (k - 1))) != 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
