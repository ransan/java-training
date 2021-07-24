package IPK.math;

public class GreatestCommonDivisor {
    public static void main(String[] args) {

        int a = 270;
        int b = 192;
        System.out.println(euclideanAlgorithm(a, b));
        /** NOTE: NORMAL APPROACH
         System.out.println(findGCD(10,15));
         **/
    }

    private static int euclideanAlgorithm(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;

    }

    private static int findGCD(int a, int b) {
        int c = Math.min(a, b);
        while (c > 0) {
            if (a % c == 0 && b % c == 0) {
                break;
            }
            c--;
        }
        return c;
    }
}
