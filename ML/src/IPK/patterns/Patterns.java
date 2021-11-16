package IPK.patterns;

public class Patterns {
    public static void main(String[] args) {
        pattern1(5);
        System.out.println("=======================================");
        pattern2(5);
        System.out.println("=======================================");
        pattern3(5);
        System.out.println("=======================================");
        pattern4(5);
        System.out.println("=======================================");
    }

    private static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    private static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    private static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = n - row + 1; col >= 1; col--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    private static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println("");
        }
    }
}
