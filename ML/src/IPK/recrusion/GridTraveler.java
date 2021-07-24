package IPK.recrusion;

import java.util.HashMap;
import java.util.Map;

/**
 * Right and down is allowed
 * Time Complexity O(n*m)
 * Space Complexity O(n+m)
 */
public class GridTraveler {
    private static Map<String, Long> memo = new HashMap<>();
    public static void main(String[] args) {
        int n = 18;
        int m = 18;
        System.out.println(findPathCount(1,1));
        System.out.println(findPathCount(2,3));
        System.out.println(findPathCount(3,3));
        System.out.println(findPathCount(n,m));
    }

    private static long findPathCount(int n, int m) {
        String key = getKey(n , m);
        if (memo.containsKey(key)) return memo.get(key);
        if (n==1 && m ==1 ) return 1;
        if (n ==0 || m ==0) return 0;
        long result = findPathCount(n-1, m) + findPathCount(n, m-1);
        memo.put(key, result);
        return memo.get(key);
    }

    private static String getKey(int n, int m) {
        return String.format("%s,%s", n,m);
    }
}
