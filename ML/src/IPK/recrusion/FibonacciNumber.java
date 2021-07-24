package IPK.recrusion;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumber {
    private static Map<Long, Long> memo = new HashMap<>();
    public static void main(String[] args) {
        long n = 100; // 12586269025
        System.out.println(getFib(n));
    }

    private static long getFib(long n) {
        if (memo.containsKey(n)) return memo.get(n);
        if (n <= 2) {
            return 1;
        }
        long result = getFib(n - 1) + getFib(n - 2);
        memo.put(n , result);
        return memo.get(n);
    }
}
