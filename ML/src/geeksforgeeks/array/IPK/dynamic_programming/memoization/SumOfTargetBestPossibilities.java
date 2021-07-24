package geeksforgeeks.array.IPK.dynamic_programming.memoization;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumOfTargetBestPossibilities {
    private static Map<Integer, List<Integer>> memo = new HashMap<>();

    public static void main(String[] args) {
        int target = 100;
        int[] array = {25, 5};
        System.out.println(shortestPath(array, target));
    }

    private static List<Integer> shortestPath(int[] array, int target) {
        if (memo.containsKey(target)) return memo.get(target);
        if (target == 0) return new ArrayList<>();
        if (target < 0) return null;
        List<Integer> shortPath = null;
        for (int num : array) {
            int sub = target - num;
            List<Integer> path = shortestPath(array, sub);
            if (path != null) {
                List<Integer> list = new ArrayList<>();
                list.addAll(path);
                list.add(num);
                if (shortPath == null || (list.size() < shortPath.size())) {
                    shortPath = list;
                }
            }
        }
        memo.put(target, shortPath);
        return shortPath;
    }
}
