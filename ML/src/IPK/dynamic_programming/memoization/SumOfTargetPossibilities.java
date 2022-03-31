package IPK.dynamic_programming.memoization;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumOfTargetPossibilities {
    private static Map<Integer, List<Integer>> memo = new HashMap<>();

    public static void main(String[] args) {
        int[] array = {1,2, 3};
        int target = 7;
        System.out.println(sum(array, target));

    }

    public static List<Integer> sum(int[] array, int target) {
        List<Integer> list = new ArrayList<>();
        if (memo.containsKey(target)) return memo.get(target);
        if (target == 0) return new ArrayList<>();
        if (target < 0) return null;
        for (int num : array) {
            int sub = target - num;
            List<Integer> output = sum(array, sub);
            if (output != null) {
                list.addAll(output);
                list.add(num);
                memo.put(target, list);
                return memo.get(target);
            }
        }
        memo.put(target, null);
        return null;
    }
}
