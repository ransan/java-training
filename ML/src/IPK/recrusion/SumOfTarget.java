package geeksforgeeks.array.IPK.recrusion;

import java.util.HashMap;
import java.util.Map;

public class SumOfTarget {
    private static Map<Integer, Boolean>  memo = new HashMap<>();
    public static void main(String[] args) {
        int[] array = {7,14};
        int target = 300;
        System.out.println(isTaragetFound(array, target));
    }

    private static boolean isTaragetFound(int[] array, int target) {
        if (memo.containsKey(target)) return memo.get(target);
        if (target == 0) return true;
        if (target < 0 ) return false;
        for (int num : array) {
            int sub = target - num;
           if (isTaragetFound(array, sub)) {
               memo.put(sub, true);
               return true;
           }
        }
        memo.put(target, false);
        return false;
    }
}
