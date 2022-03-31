package IPK.array;

import java.util.Scanner;

public class JumpGameProblem {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(isReachable(array, n));
    }

    private static boolean isReachable(int[] array, int n) {
        int reachable = 0;
        for (int i = 0; i < n; i++) {
            if (reachable < i) {
                return false;
            }
            reachable = Math.max(reachable, i + array[i]);
        }
        return true;
    }
}
