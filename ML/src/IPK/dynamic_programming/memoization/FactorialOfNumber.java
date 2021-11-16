package IPK.dynamic_programming.memoization;

import java.util.HashMap;
import java.util.Map;

public class FactorialOfNumber {
    private static Map<Long, Long> memo = new HashMap<>();
    public static void main(String[] args) {
         System.out.println(fact(10));
    }

    private static long fact(long i) {
        if (memo.containsKey(i)) return memo.get(i);
        if ( i == 0 || i == 1) return 1;
        long result = i * fact(i - 1);
        memo.put(i, result);
        return memo.get(i);
    }
}
