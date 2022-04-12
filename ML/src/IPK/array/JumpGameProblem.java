package IPK.array;

import java.util.Scanner;

public class JumpGameProblem {
    public static void main(String[] args) {

        System.out.println(isReachable(new int [] {1,0,2}, 3));
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
