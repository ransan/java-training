package geeksforgeeks.array.IPK.dynamic_programming.memoization;

import java.util.HashMap;
import java.util.Map;

public class CanConstructString {
    private static Map<String, Boolean> memo = new HashMap<>();

    public static void main(String[] args) {
        String target = "enterapotentpot";
        String[] array = {"a", "p", "ent", "enter", "ot", "o", "t"};
        System.out.println(canConstruct(array, target));
    }

    private static boolean canConstruct(String[] array, String target) {
        if (memo.containsKey(target)) return memo.get(target);
        if (target.equals("")) return true;

        for (String word : array) {
            if (target.indexOf(word) == 0) {
                String sub = target.substring(word.length());
                if (canConstruct(array, sub) == true) {
                    memo.put(target, true);
                    return memo.get(target);
                }
            }
        }
        memo.put(target, false);
        return false;
    }
}
