package geeksforgeeks.array.IPK.dynamic_programming.tabulation;

import java.util.Arrays;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fib(6));
    }

    private static int fib(int n) {
        int[] array = new int[n + 1];
        Arrays.fill(array, 0);
        array[1] = 1;
        for (int i = 0; i <= n; i++) {
            if (i < n) {
                array[i + 1] += array[i];
            }
            if (i < n-1) {
                array[i + 2] += array[i];
            }
        }
        return array[n];
    }
}
