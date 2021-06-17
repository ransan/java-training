package geeksforgeeks.array.IPK.math;

// Time Complexity O(log(min(a,b)))
public class LeastCommonMultiple {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        euclideanMethod(a, b);
        System.out.println(a * b / euclideanMethod(a, b));
        /** NOTE: Normal Solution
         System.out.println(calculateLCM(a, b));
         **/
    }

    private static int euclideanMethod(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    private static int calculateLCM(int a, int b) {
        int c = Math.max(a, b);
        while (true) {
            if (c % a == 0 && c % b == 0) {
                return c;
            }
            c++;
        }
    }
}
