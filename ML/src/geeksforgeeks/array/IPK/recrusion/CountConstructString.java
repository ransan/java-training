package geeksforgeeks.array.IPK.recrusion;

import java.util.HashMap;
import java.util.Map;

public class CountConstructString {
    private static Map<String, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        String target = "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef";
        String[] array = {"e"};
        System.out.println(countConstruct(array, target));
    }

    private static int countConstruct(String[] array, String target) {
       if (memo.containsKey(memo)) return memo.get(target);
        if (target.equals("")) return 1;
        int count = 0;
        for (String word : array) {
            if (target.indexOf(word) == 0) {
                String sub = target.substring(word.length());
                count += countConstruct(array, sub);
            }
        }
        memo.put(target, count);
        return count;
    }
}
